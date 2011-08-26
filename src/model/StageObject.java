package model;

import org.newdawn.slick.Color;

public class StageObject {
	
	private String templateName;
	private Point position, rotation, scale;
//	private Color color;
	
	public StageObject(String templateName, Point position, Point rotation, Point scale) {
		this.templateName = templateName;
		this.position = position;
		this.rotation = rotation;
		this.scale = scale;
//		this.color = color;
	}
	
	public void render() {
		StageObjectTemplate stageObjectTemplate = StageObjectTemplateHandler.getInstance().getTemplate(templateName);
		for(Surface surface : stageObjectTemplate.getSurfaces()) {
			surface.render(position, rotation, scale);
		}
	}
	
}