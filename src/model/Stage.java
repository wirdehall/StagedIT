package model;

// TODO: only import whats needed yo!
import java.util.ArrayList;
import com.google.gson.*;
import java.util.LinkedList;

public class Stage {
	
	private LinkedList<StageObjectTemplate> stageObjectTemplates = new LinkedList<StageObjectTemplate>();
	private LinkedList<StageObject> stageObjects = new LinkedList<StageObject>();
	
	public Stage() {
		
		JsonParser stageObjectTemplateContainer = new JsonParser();
		stageObjectTemplateContainer.parseFile("data/objectsSpecifications.json", LinkedList<StageObjectTemplate>.class);
/*		Gson gson = new GsonBuilder().create();
		try {
			Reader reader = new InputStreamReader(new FileInputStream("data/objectsSpecifications.json"));
			stageObjectTemplateContainer = gson.fromJson(reader, JsonListObject.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println(stageObjectTemplateContainer.getList());
		for (Object sot : stageObjectTemplateContainer.getList()) {
			stageObjectTemplates.add((StageObjectTemplate)sot);
		}
		
		StageObjectTemplateHandler.getInstance().addTemplates(stageObjectTemplates);
		JsonListObject stageObjectsContainer = null;
		
		try {
			Reader reader = new InputStreamReader(new FileInputStream("data/stages/stage1.json"));
			stageObjectsContainer = gson.fromJson(reader, JsonListObject.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//System.out.println(stageObjectsContainer.getList());
		
		for (Object so : stageObjectsContainer.getList()) {
			stageObjects.add((StageObject)so);
		}
		
		
/*		stageObjects.add(new StageObject("cube", new Point(3,5,-10),	new Point(-40f, 0f, 0f),	new Point(1f,1f,1f)));
		stageObjects.add(new StageObject("cube", new Point(3,-5,-10),	new Point(0f, 0f, -23f),	new Point(0.8f,1f,1f)));
		stageObjects.add(new StageObject("cube", new Point(0,2,-3),		new Point(0f, 30f, 0f),		new Point(0.2f,0.2f,0.2f)));
		stageObjects.add(new StageObject("cube", new Point(0,0,-3),		new Point(0f, 0f, 0f),		new Point(0.1f,0.5f,0.8f)));
	//	gson.fromJson(,StageObject.class)
	/*	while ((line = objectsSpecifications.readLine()) != null) {
			if (line.trim().length() == 0 || line.trim().startsWith("//")) {
				continue;
			}
			if (line.startsWith("NUMPOLLIES")) {
				numPollies = Integer.parseInt(line.substring(line.indexOf("NUMPOLLIES") + "NUMPOLLIES".length() + 1));
				break;
			}
		}*/
	}

	public void tick() {
	}

	public LinkedList<StageObjectTemplate> getStageObjectTemplates() {
		return stageObjectTemplates;
	}
	
	public LinkedList<StageObject> getStageObjects() {
		return stageObjects;
	}
	
}