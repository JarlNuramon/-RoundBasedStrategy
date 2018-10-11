package events;

import java.util.LinkedList;

import entities.BaseEntity;

public abstract class Events {
	private boolean sceneFinished;
	private String sceneName;
	private String startString;
	private String startDecisions[] = new String[3];
	private LinkedList<BaseEntity> entities = new LinkedList<BaseEntity>();
	private String[] results;   
	public Events(String sceneName, String startString, String startDecisions[]) {
		this.sceneName = sceneName;
		this.startString = startString;
		this.startDecisions = startDecisions;
		sceneFinished = false;
		results=new String[3];
	}
	
	public String[] DecisionA() {
		evaluateResult(results[0]);
		
		return null;
	}

	public String[] DecisionB(String s) {
		evaluateResult(results[1]);
		
		return null;
	}

	public String[] DecisionC(String s) {
		evaluateResult(results[2]);
		return null;
	}

	public LinkedList<BaseEntity> getEntities() {
		return entities;
	}

	public void evaluateResult(String res)
	{
		if(res.contains("Create"))
		{
			String temp =res.substring(res.indexOf("Create"),res.length());
			if(temp.contains("Monster"))
			{
				
			}
		}
	}
	public void setEntities(LinkedList<BaseEntity> entities) {
		this.entities = entities;
	}
	
	public boolean isSceneFinished() {
		return sceneFinished;
	}
	
	public void setSceneFinished(boolean sceneFinished) {
		this.sceneFinished = sceneFinished;
	}
	public String getSceneName() {
		return sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}
	public String getStartString() {
		return startString;
	}
	public void setStartString(String startString) {
		this.startString = startString;
	}
	public String[] getStartDecisions() {
		return startDecisions;
	}
	public void setStartDecisions(String[] startDecisions) {
		this.startDecisions = startDecisions;
	}

	public String[] getResults() {
		return results;
	}

	public void setResults(String[] results) {
		this.results = results;
	}

	
	
	
	
}
