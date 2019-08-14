package Proxemic;

import java.util.ArrayList;

/**
 * The class provides methods to validate the face orientation  of interaction objects both EI and EG. 
 *  @author pperez003
 *
 */
public class Orientation {
//boolean face;
String[][] detedface;
Object obj;
private ProxZone proxZone;
/**
 * The method receives a collection of faces to be defined as interaction objects EI and EG in the Proxemic Enviroment
 * @param faceDeted
 */
/*
public void setDetectedFaces (String[][] faceDeted) {
	
}
*/


public Object getFaceObjec() {
	return this.obj;
}
/**
 * The method returns true if a specific face EI is detected by the smartphone camera
 * @param String Entity 
 * @return boolean
 */
public boolean	isFaceDetected(String E, String zone) {
	Distance d = new Distance();
	for(int i = 0;i<this.detedface.length;i++)
	{  
		 float f = Float.parseFloat(detedface[i][1]);
		 d.setfaceHeight(f);
		 String proZon=proxZone.setDistanceofEntity(d.getDistance());
		 if(zone==proZon && E==detedface[i][0]) { 
			 System.out.println("It is on zone =" +E);
			 return true;
		 }
	}
	return false;
}
private Distance Distance() {
	// TODO Auto-generated method stub
	return null;
}
public  void setDetectedFaces(String[][] faceDeted,ProxZone p){
	this.proxZone=p;	
    this.detedface=faceDeted;
	}	
}
