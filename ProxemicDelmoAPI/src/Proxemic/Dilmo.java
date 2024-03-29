package Proxemic;

import java.util.ArrayList;

/**
 * This class offers the possibility of identifying  the Proxemic Zone of all entities or identities,
 *  which will interact in the Proxemic Environment. It is a useful class for developing Proxemic Environment.
 *  @author pperez003
 *
 */
public class Dilmo {
	private ProxZone proxZone;
	private String zoneEg;
	
	public Dilmo(ProxZone proxZone) {
	this.proxZone=proxZone;
	}
	/**
	 * This method allows to assign a proxemic to an identifiable entity or identity based on the distance D.
	 * @param entity identifiable
	 * @param distance
	 */
 public void setProxemicDistIdenEntity(String entity, double distance) {	
	if (this.proxZone.getEntities().size()==0) {this.setIniEnty(entity, distance);}
	else {
			for (int i=0; i<this.proxZone.getEntities().size();i++ ) {
				if (this.proxZone.getEntities().get(i).getIdenEntityName()==entity) {
					this.proxZone.getEntities().get(i).getRelOfDis().setDistance(distance);					
					//System.out.println(this.proxZone.getEntities().get(i).getIdenEntityName());
				}
				else {
					 Entity Ed0= new Entity(entity);
					 Distance d= new Distance();
					 Ed0.setRelOfDis(d);
					 Ed0.distance.setDistance(distance);
					 this.proxZone.getEntities().add(Ed0);
				}
				
			}
	}
	 
	}
 /**
  * This method returns the proxemic Zone of an identifiable  entity identifiable
  * @param entity name
  * @return
  */
 public String getProxemicZoneIdenEntity(String entity) {
	 for (int i=0; i<this.proxZone.getEntities().size(); i++) 
	 {
	  if(entity==this.proxZone.getEntities().get(i).getIdenEntityName()) {
	  	  double ds=this.proxZone.getEntities().get(i).getRelOfDis().getDistance();
		  //System.out.println(this.proxZone.setDistanceofEntity(ds));
	  	  return this.proxZone.setDistanceofEntity(ds);
	 }
	 }
	 return null;
 }
 
 public void setProxemicDIL(String entity,double distance,float location) {
	 
		if (this.proxZone.getEntities().size()==0) {this.setIniEntyDILMO(entity, distance, location);;}
		else {
				for (int i=0; i<this.proxZone.getEntities().size();i++ ) {
					if (this.proxZone.getEntities().get(i).getIdenEntityName()==entity) {
						this.proxZone.getEntities().get(i).getRelOfLoc().setRelativeLocationScreen(location);
						this.proxZone.getEntities().get(i).getRelOfDis().setDistance(distance);					
						//System.out.println(this.proxZone.getEntities().get(i).getIdenEntityName());
					}
					else {
						 Entity Ed0= new Entity(entity);
						 Distance d= new Distance();
						 Location lo = new Location();
						 Ed0.setRelOfDis(d);
						 Ed0.distance.setDistance(distance);
						 Ed0.setRelOfLocation(lo);
						 Ed0.location.setRelativeLocationScreen(location);
						 this.proxZone.getEntities().add(Ed0);
					}
					
				}
		}
 }
 
 public String getProxemicDIL(String entity) {
	 for (int i=0; i<this.proxZone.getEntities().size(); i++) 
	 {
	  if(entity==this.proxZone.getEntities().get(i).getIdenEntityName()) {
	  	  double ds=this.proxZone.getEntities().get(i).getRelOfDis().getDistance();
	  	  String loc=			this.proxZone.getEntities().get(i).getRelOfLoc().getRelativeLocationOnScree();
	  	  //System.out.println(this.proxZone.setDistanceofEntity(ds));
	  	  return this.proxZone.setDistanceofEntity(ds)+"-"+loc;
	 }
	 }
	 return null;
 }
 
 public void setProxemicDIM (String entity,double distance,String axe,float max,float min,float value ) {
		if (this.proxZone.getEntities().size()==0) {this.setDIM(entity, distance, axe, max, min, value);}
		else {
				for (int i=0; i<this.proxZone.getEntities().size();i++ ) {
					if (this.proxZone.getEntities().get(i).getIdenEntityName()==entity) {
						 switch (axe) {
						 case "azimuth":this.proxZone.getEntities().get(i).getRelOfDisMov().setAzimuthWithRange(max, min, value);break;
						 case "pitch":this.proxZone.getEntities().get(i).getRelOfDisMov().setPitchWithRange(max,min,value);break;
						 case "roll":this.proxZone.getEntities().get(i).getRelOfDisMov().setRollWithRange(max,min,value);break;
						default:break;
					 }
						this.proxZone.getEntities().get(i).getRelOfDis().setDistance(distance);					
						//System.out.println(this.proxZone.getEntities().get(i).getIdenEntityName());
					}
					else {
						//this.setDIM(entity, distance, axe, max, min, value); 
						
						 Entity Ed0= new Entity(entity);
						 Distance d= new Distance();
						 Movement mo = new Movement();
						 Ed0.setRelOfDis(d);
						 Ed0.distance.setDistance(distance);
						 Ed0.setRelOfDisMov(mo);
						 //Ed0.location.setRelativeLocationScreen(location);
						  switch (axe) {
							 case "azimuth":Ed0.movement.setAzimuthWithRange(max,min, value);break;
							 case "pitch":Ed0.movement.setPitchWithRange(max,min, value);break;
							 case "roll":Ed0.movement.setRollWithRange(max,min, value);break;
							default:break;
						 }
						 
						 this.proxZone.getEntities().add(Ed0);
						 
					}
					
				}
		} 
 }
 public String getProxemicDIM(String entity,String axe) {
	 for (int i=0; i<this.proxZone.getEntities().size(); i++) 
	 {
	  if(entity==this.proxZone.getEntities().get(i).getIdenEntityName()) {
	  	  double ds=this.proxZone.getEntities().get(i).getRelOfDis().getDistance();
	  	  //String loc=			this.proxZone.getEntities().get(i).getRelOfLoc().getRelativeLocationOnScree();
	  	Boolean moAxi= false;
	  	  switch (axe) {
		 case "azimuth":moAxi=this.proxZone.getEntities().get(i).getRelOfDisMov().isAzimuthInRange();break;
		 case "pitch":moAxi=this.proxZone.getEntities().get(i).getRelOfDisMov().isPitchInRange();break;
		 case "roll":moAxi=this.proxZone.getEntities().get(i).getRelOfDisMov().isRollInRange();break;
		default:break;
	 }
	  	  String valueAx;
	  	  if(moAxi==true) valueAx="inTheRange ";else valueAx="outOfRange.";
	  	  //System.out.println(this.proxZone.setDistanceofEntity(ds));
	  	  return this.proxZone.setDistanceofEntity(ds)+"-"+ valueAx;
	 }
	 }
	 
	 return null;
 }
 public void setDEM(String entity, double distance,float hight,float low,float azimuthZ) {
	 
	 
	 Entity Ed0= new Entity(entity);
	 Distance d= new Distance();
	 Movement m= new Movement();
	// m.setAzimuthWithRange(entity, hight, low, azimuthZ);
	 Ed0.setRelOfDis(d);
	 Ed0.setRelOfDisMov(m);
	 Ed0.distance.setDistance(distance);
	 Ed0.movement.setAzimuthWithRange(hight, low, azimuthZ);
	 this.proxZone.setEntities(Ed0);
	 	 
 }
 public String getDem(String entity) {
	 for (int i=0; i<this.proxZone.getEntities().size(); i++) 
	 {
	  if(entity==this.proxZone.getEntities().get(i).getIdenEntityName()) {
	  	  double ds=this.proxZone.getEntities().get(i).getRelOfDis().getDistance();
	  	  boolean mo=this.proxZone.getEntities().get(i).getRelOfDisMov().isAzimuthInRange();
		  if (mo)return this.proxZone.setDistanceofEntity(ds)+ "true";
	  	  //System.out.println(this.proxZone.setDistanceofEntity(ds));
		  return this.proxZone.setDistanceofEntity(ds)+ "false";
	 }
	 }
	 return null;}
 public String getOrinEntity(String zone, boolean face) {
	 	 return "event";
 }
 public String getLocationOrinEntity(String zone, boolean face, String location) {
 	 return "event";
}
 public String getMotionEntity(String zone, String motion) {
 	 return "event";
}
 public String getMotionDistEntity(String zone, float azimutZ, float rollY, float pitchY ) {
 	 return "event";
}
 /**
  * This method allows to assign the Proxemic Zone of a generic entity EG,
  * according to the distance D.
  * @param distance
  */
 public void setProxemicDistGenEntity(double distance) {
	this.zoneEg= this.proxZone.setDistanceofEntity(distance);
	 
 }
 /**
  * This method returns the Proxemic Zone of an generic  entity identifiable
  * @param entity name
  * @return
  */
 public String getProxemicZoneGenEntity() {
	 return this.zoneEg;
 }
 
 
 private void setIniEnty(String entity, double distance) {
	 	 
		 Entity Ed0= new Entity(entity);
		 Distance d= new Distance();
		 Ed0.setRelOfDis(d);
		 Ed0.distance.setDistance(distance);
		 this.proxZone.setEntities(Ed0);
	 	 
	 }


 private void setIniEntyDILMO(String entity,double distance,float location) {
	 if(this.proxZone.getEntities().size()==0) { 
		 Entity Ed0= new Entity(entity);
		 Distance d= new Distance();
		 Location lo= new Location();
		 Ed0.setRelOfDis(d);
		 Ed0.distance.setDistance(distance);
		 Ed0.setRelOfLocation(lo);
		 Ed0.location.setRelativeLocationScreen(location);
		 this.proxZone.setEntities(Ed0);
 	 }
   }
 private void setDIM(String entity,double distance,String  axe,float max,float min,float value) {
	 if(this.proxZone.getEntities().size()==0) { 
		 Entity Ed0= new Entity(entity);
		 Distance d= new Distance();
		 Movement mo= new Movement();
		 Ed0.setRelOfDis(d);
		 Ed0.distance.setDistance(distance);
		 Ed0.setRelOfDisMov(mo);
		 switch (axe) {
			 case "azimuth":Ed0.movement.setAzimuthWithRange(max,min,value);break;
			 case "pitch":Ed0.movement.setPitchWithRange(max,min,value);break;
			 case "roll":Ed0.movement.setRollWithRange(max,min,value);break;
			default:break;
		 }
		this.proxZone.setEntities(Ed0);
 	 }
   }
 public static void main(String[] args) {
	 	
	 	//**Proxemic zone**
		ProxZone p = new ProxZone(0.5,1,4,50);
		Dilmo dilmo= new Dilmo(p);
//**** test DI************
		
		dilmo.setProxemicDistIdenEntity("Paulo", 7);
		 dilmo.setProxemicDistIdenEntity("Paulo", 0.2);
	  //  dilmo.setProxemicDistIdenEntity("Iva", 2);
	   //dilmo.setProxemicDistIdenEntity("Rica", 0.2);
	 //dilmo.setProxemicDistIdenEntity("Paulo", 4);
	  System.out.println(dilmo.getProxemicZoneIdenEntity("Paulo"));
	 // System.out.println(dilmo.getProxemicZoneIdenEntity("Iva"));
//**** test DIL************
		
	      dilmo.setProxemicDIL("Antonio", 3, 500);
	      System.out.println(dilmo.getProxemicDIL("Antonio"));
	      /* dilmo.setProxemicDIL("Carlos", 2,20);
	      System.out.println(dilmo.getProxemicDIL("Carlos"));
	      String s = dilmo.getProxemicDIL("Carlos");
	      String[] data = s.split("-", 2);
	      System.out.println("Carlos = "+data[0] +" ,Location = "+data[1]); 
	     */
//**** test DIM************	      
	 dilmo.setProxemicDIM("Fanny", 8, "azimuth", 8, 2, 9);
	 System.out.println(dilmo.getProxemicDIM("Fanny","azimuth"));    
	      
//**** test DIO***** aqui
Orientation orientation = new Orientation();

	String myTwoDimensionalStringArray[][] = new String[2][2];
	myTwoDimensionalStringArray[0][0] = "id0";
	myTwoDimensionalStringArray[0][1] = "100";
	myTwoDimensionalStringArray[1][0] = "id1";
	myTwoDimensionalStringArray[1][1] = "300";
	orientation.setDetectedFaces(myTwoDimensionalStringArray,p);
    orientation.isFaceDetected("id0","socialZone");
     //***dem
	  //System.out.println( dilmo.getProxemicZoneIdenEntity("Iva"));
	  //System.out.println( dilmo.getProxemicZoneIdenEntity("Rica"));
	 // dilmo.setDEM("Ethan",3 , 4, 1, 3);
	  //dilmo.setDEM("Ethan",0.2 , 4, 1, 3);
	 //System.out.println(dilmo.getDem("Ethan"));
		
		/*
		//Distance class Test
		 Distance dist =new Distance();
		//Example
		//dist.setBluetoohDistance(-70, -59);
		//System.out.println(dist.getDistance());
		double distArray[]= {1.5,1.6,2,2,2.2,3};
		int n=distArray.length;
		int i=0;
		//Dinamic distance
		while(i<5)
		{	
		//System.out.println(dist.setDynamicDistance(distArray[i]));
			i++;
		}
		
		//dist.setfaceHeight(243);
		//System.out.println(dist.getDistance());
		//dilmo.setProxemicDistGenEntity(0.5);
		//System.out.println("x"+dilmo.getProxemicZoneGenEntity());
		*/
		
	}
	
}
