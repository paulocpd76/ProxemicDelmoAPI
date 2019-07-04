package Proxemic;

import java.util.ArrayList;
/**
 * This class allows estimate the distance among general 
 * entities EG or identifiable entities EI 
 * @author pperez003
 *
 */
public class Distance {
	double distance;
	ArrayList<Double> dlist=new ArrayList<Double>();  	
	public Distance() {
		
		// TODO Auto-generated constructor stub
	}
	/**
	 * This method returns distance meters
	 * @return
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 *  The method allows establishing a distance value
	 * @param distance
	 */

	public void setDistance(double distance) {
		this.distance = distance;
	}

	/**
	 * This method allows estimate distance based on BLE
	 * @return distance Bluetooth
	 * @param rssi  indications of the power level being received by an antenna
	 * @param value of the transmission power of device
	 * @return double distance
	 */
	public double setBluetoothDistance(double rssi, double txPower ) {
		    /*
		     * RSSI = TxPower - 10 * n * lg(d)
		     * n = 2 (in free space)
		     * 
		     * d = 10 ^ ((TxPower - RSSI) / (10 * n))
		     */
	return this.distance= Math.pow(10d, ((double) txPower - rssi) / (10 * 2));
   
	}
	
	/**
	 * 
	 * @param d dimamic distances
	 * @return decreasing or increasing  distances
	 */
	public String setDynamicDistance(double d) {
		this.dlist.add(d);
		int upPto=this.dlist.size();
		String ds= new Double(d).toString();	
		if(upPto>1) {
			if (d==this.dlist.get(upPto-2))return "stop";
			this.dlist.get(upPto-2);
			if(this.dlist.get(upPto-1)>this.dlist.get(upPto-2)) return "up++";
			else {return "down++";}
		}
		return "iniDistance";

	}
	/**
	 * This method allows estimate distance from camera  
	 * @param faceHeight the height of the detected face
	 */
	public void setfaceHeight(float faceHeight) {
		float distTem=243/faceHeight;
		this.distance=(double)distTem;
	}
	
	

}

	
