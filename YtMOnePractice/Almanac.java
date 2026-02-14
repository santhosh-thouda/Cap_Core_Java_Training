package YtMOnePractice;

import java.util.*;

public class Almanac {
	HashMap<String, ArrayList<String>> projects = new HashMap<>();
	
	public String assignProject(String name, String project){
		if(!projects.containsKey(name)) {
			ArrayList<String> arrList = new ArrayList<>();
			arrList.add(project);
			projects.put(name, arrList);
		}
		else {
			ArrayList<String> getProjects = projects.get(name);
			getProjects.add(project);
			projects.put(name, getProjects);
		}
		return "Project assigned successfully";
	}
	
	public ArrayList<String> currentProjects(String name){
		if(projects.containsKey(name)) {
			return projects.get(name);
		}
		return null;
	}
	
	public String finishProject(String name, String project) {
		ArrayList<String> getProjects = projects.get(name);
		if(projects.containsKey(name)) {
			if(getProjects.contains(project)) {
				getProjects.remove(project);
				projects.put(name, getProjects);
				return "Project finished successfully";
			}
		}
		return "Not found"; 
	}
}
