       package Proxemic;

import java.awt.List;
import java.util.ArrayList;
/**
 * This class allows to define proxemic zones according to user requirements
 * (i.e., user/developer decides the measures of each proxemic zone),
 * when this class is instantiated (i.e.,  by its constructor method). 
 * 
 * @author pperez003
 *
 */

public class ProxZone {
	private static final double MAX_INTIMATE_ZONE =0.5;
	private static final double MAX_PERSONAL_ZONE =1;
	private static final double MAX_SOCIAL_ZONE =4;
	private double intimate,personal,social,publicZone;
	protected  String entityZone;
	ArrayList<Entity> entities = new ArrayList<Entity>();
	

	/**
	 * The constructor method of this class receives as parameters the respective maximum measures of  distance D,
	 * which define each Proxemic Zone by the constructor method. Inappropriate arguments are validated in order to have right measures (e.g., not overlapped zones, right order of measures).
	 * @param intimate distance of intimate zone 
	 * @param personal distance of personal zone
	 * @param social distance of  social zone
	 * @param publicZone distance of public zone
	 * @throws IllegalArgumentException if intimate <= 0 or
     *          rate > MAX_INTIMATE_ZONE.
	 */
	public ProxZone(double intimate, double personal, double social, double publicZone) {
		 if (intimate <= 0 || intimate > MAX_INTIMATE_ZONE || personal<=intimate || 
			 personal>MAX_PERSONAL_ZONE||social<=personal||social>MAX_SOCIAL_ZONE||publicZone<=social)
             throw new IllegalArgumentException("Ilegal Zone : ");
		this.intimate = intimate;
		this.personal = personal;
		this.social = social;
		this.publicZone = publicZone;
		}
	
	
	/**
	 * 
	 * @param distance of Entity  this must be in meters
	 * @return
	 */
	public String setDistanceofEntity(double distance) {
	 if (distance == 0) {
		      throw new IllegalArgumentException(distance + " is equal than 0");
	 }
	if (distance<=this.intimate) {return "intimiZone";}
	if (distance>this.intimate && distance<=this.personal) {return "personalZone";}
	if (distance>this.personal && distance<=this.social) {return "socialZone";}
	return "publicZone";
	}
	
	public  String getEntityGenZone() {
		
		return entityZone;
	}
	
	public ArrayList<Entity> getEntities() {
		return entities;
	}
	
	public void setEntities(Entity entities) {
	
		this.entities.add(entities);
		
		
	}

	public static double getMaxIntimateZone() {
		return MAX_INTIMATE_ZONE;
	}

	public static double getMaxPersonalZone() {
		return MAX_PERSONAL_ZONE;
	}

	public static double getMaxSocialZone() {
		return MAX_SOCIAL_ZONE;
	}
	
	
	
	}
