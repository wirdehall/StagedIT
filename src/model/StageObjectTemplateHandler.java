package model;

import java.util.LinkedList;
import java.util.HashMap;

public class StageObjectTemplateHandler {
	
	private static StageObjectTemplateHandler instance = null;
	private HashMap<String, StageObjectTemplate> stageObjectTemplates = new HashMap<String, StageObjectTemplate>();
	
	private StageObjectTemplateHandler() {
		
	}
	
	public StageObjectTemplate getTemplate(String templateName) {
		if (!stageObjectTemplates.containsKey(templateName)) {
			try {
				throw new Exception("StageObjectTemplateHandler: No such StageObjectTemplate! You tried to call StageObjectTemplate with name: " + templateName);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return stageObjectTemplates.get(templateName);
	}
	
	public void addTemplates(LinkedList<StageObjectTemplate> stageObjectTemplates) {
		for (StageObjectTemplate sot : stageObjectTemplates) {
			this.stageObjectTemplates.put(sot.getName(), sot);
		}
	}
	
	
	public static StageObjectTemplateHandler getInstance() {
		if (instance == null) {
			instance = new StageObjectTemplateHandler();
		}
		return instance;
	}
	
	
}