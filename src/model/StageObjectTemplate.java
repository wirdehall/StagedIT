package model;

import model.*;
import java.util.LinkedList;

public class StageObjectTemplate {

	private String name;
	private LinkedList<Surface> surfaces; 

	public StageObjectTemplate(String name, LinkedList<Surface> surfaces) {
		this.name = name;
		this.surfaces = surfaces;
	}
	
	public String getName() {
		return name;
	}
	
	public LinkedList<Surface> getSurfaces() {
		return surfaces;
	}
	
/*	
	public void render() {
		for(Surface surface : surfaces) {
			surface.render();
		}
	}
*/	
}