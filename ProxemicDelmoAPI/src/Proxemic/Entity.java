
package Proxemic;
import Proxemic.Distance;
/**
 * The class allows interaction between objects 
 * 
 * @author pperez003
 *
 */
public class Entity {
	Distance distance;
	Movement movement;
	Location location;
	Orientation orientation;
	String identity;
	public Entity(String identity) {
		this.identity = identity;
	}
	
	public String getIdenEntityName() {
		return identity;
	}

	public Distance getRelOfDis() {
		return distance;
	}

	public void setRelOfDis(Distance distance) {
		this.distance = distance;
	}
	public void setRelOfDisMov(Movement movement) {
		
		this.movement=movement;
	}
	public Movement getRelOfDisMov() {
		return movement;
	}
	
	public Location getRelOfLoc() {
		return location;
	}
	public void  setRelOfLocation(Location location) {
		this.location=location;
	}
	

	/*
	public String getIndentityName() {
		return identity;
	}
	*/


	
	
}
