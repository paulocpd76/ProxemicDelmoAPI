package Proxemic;



public class Movement {
 private float azimuthZ;
 private float rollY;
 private float pitchX;
 private boolean rangAzimuth;
 private boolean rangRoll;
 private boolean rangPith;
 
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
public void setAzimuthWithRange(float hight,float low,float azimuthZ) {
	if(low <azimuthZ && azimuthZ <hight) this.rangAzimuth=true;
	else this.rangAzimuth=false;
	
}

public void setRollWithRange(float hight,float low, float rollY) {
	if(low <rollY && rollY <hight) this.rangRoll=true;
	else this.rangRoll=false;
}
public void setPitchWithRange(float hight,float low, float pitchX) {
	if(low <pitchX && pitchX <hight) this.rangPith=true;
	else this.rangPith=false;

}


/**
 * test
 * The method returns true if the azimuth angle of an interaction object EI and EG is within a range of reference
 * @return boolean 
 */
public boolean isAzimuthInRange() {
	return this.rangAzimuth;
}
public boolean isRollInRange() {
	return this.rangRoll;
}
public boolean isPitchInRange() {
	return this.rangPith;
}
 
}
