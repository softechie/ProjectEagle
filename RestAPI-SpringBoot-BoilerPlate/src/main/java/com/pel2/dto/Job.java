package com.pel2.dto;

import org.springframework.data.annotation.Id;

public class Job {

    @Id
    public String id;

    public String category;
    public String type;
    public int state;
    public int priority;
    public Job[] dependencies;

	public Job() {}
	public Job(String category, String type, int state, int priority, Job[] dependencies) {
		super();
		this.category = category;
		this.type = type;
		this.state = state;
		this.priority = priority;
		this.dependencies = dependencies;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Job[] getDependencies() {
		return dependencies;
	}
	public void setDependencies(Job[] dependencies) {
		this.dependencies = dependencies;
	}
	@Override
    public String toString() {
        return String.format(
                "Job[id=%s, category='%s', type='%s', state='%d', priority='%d', dependencies='%s']",
                id, category, type, state, priority, dependencies);
    }
	
}