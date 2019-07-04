package Proxemic;



public class Movement {
 private float azimuthZ;
 private float rollY;
 private float pitchX;
 
 
 /***
  * This class allows to obtain motion processing from coordinate system of smart-mobile sensors
  */
public Movement() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * The method allows processing the azimuth angle of an entity EI or EG,
 * @param E
 * @param hight
 * @param low
 * @param azimuthZ
 */
public void setAzimuthWithRange(String E,float hight,float low,float azimuthZ) {
	this.azimuthZ = azimuthZ;
}

public boolean setRollWithRange(String E,float hight,float low, float rollY) {
	return true;
}
public void setPitchWithRange(String E,float hight,float low, float pitchX) {
	this.pitchX = pitchX;
}
/**
 * The method returns true if the azimuth angle of an interaction object EI and EG is within a range of reference
 * @return boolean 
 */
public boolean isAzimuthInRange() {
	return true;
}
public float isRollInRange() {
	return rollY;
}
public boolean isPitchInRange() {
	return true;
}
 
}
