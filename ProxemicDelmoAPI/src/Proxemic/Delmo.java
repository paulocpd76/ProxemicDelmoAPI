package Proxemic;

import java.util.ArrayList;
/**
 * This class offers the possibility of identifying  the Proxemic Zone of all entities or identities,
 *  which will interact in the Proxemic Environment. It is a useful class for developing Proxemic Environment.
 *  @author pperez003
 *
 */
public class Delmo {
	private ProxZone proxZone;
	private String zoneEg;
	
	public Delmo(ProxZone proxZone) {
	this.proxZone=proxZone;
	}
	/**
	 * This method allows to assign a proxemic to an identifiable entity or identity based on the distance D.
	 * @param entity identifiable
	 * @param distance
	 */
 public void setProxemicDistIdenEntity(String entity, double distance) {
	 Entity Ed0= new Entity(entity);
	 Distance d= new Distance();
	 Ed0.setRelOfDis(d);
	 Ed0.distance.setDistance(distance);
	 this.proxZone.setEntities(Ed0);
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
 
 
 public static void main(String[] args) {
		ProxZone p = new ProxZone(0.5,1,4,50);
		
		Delmo dilmo= new Delmo(p);
		dilmo.setProxemicDistIdenEntity("Paulo", 3);
	   dilmo.setProxemicDistIdenEntity("Iva", 0.7);
	    System.out.println( dilmo.getProxemicZoneIdenEntity("Iva"));
	    System.out.println(dilmo.getProxemicZoneIdenEntity("Paulo"));
		
		
		//Distance class
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
		dilmo.setProxemicDistGenEntity(0.5);
		System.out.println("x"+dilmo.getProxemicZoneGenEntity());
		
	}
	
}
