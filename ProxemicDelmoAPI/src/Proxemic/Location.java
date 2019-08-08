package Proxemic;
/**
 * The class provides methods to manage location L of interaction objects both EI and EG.
 *  As in the {\tt Distance class}, location L of entities can be calculated by any available method. 
 *  Currently, we have integrated in our API some methods to calculate L.
 * @author pperez003
 *
 */
public class Location {
	private String locationScreen;
	/**
	 * The method sets the relative position on the screen of an entity EI and EG. 
	 * @param location  coordinates of the entity on the display
	 */
	public void setRelativeLocationScreen (float location) {
		if( location>300) {this.locationScreen="topLeft";}
		else {this.locationScreen="topRight";}
	}
	/**
	 * The method returns the relative position of an entity.
	 * @return
	 */
	public String getRelativeLocationOnScree() {
		return this.locationScreen;
	}
}
