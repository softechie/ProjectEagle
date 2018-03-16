package com.pel2.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Job {

    @Id
    public String id;

    public String category;
    public String type;
    public String ref;
    public int state;
    public int scheduled;
    public String[] dependencies;

	public Job() {}
	public Job(String id, String category, String type, String ref, int state, int scheduled, String[] dependencies) {
		super();
		this.id = id;
		this.category = category;
		this.type = type;
		this.ref = ref;
		this.state = state;
		this.scheduled = scheduled;
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
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getScheduled() {
		return scheduled;
	}
	public void setScheduled(int scheduled) {
		this.scheduled = scheduled;
	}
	public String[] getDependencies() {
		return dependencies;
	}
	public void setDependencies(String[] dependencies) {
		this.dependencies = dependencies;
	}
	@Override
    public String toString() {
        return String.format(
                "Job[id=%s, category='%s', type='%s', ref='%s', state='%d', scheduled='%d', dependencies='%s']",
                id, category, type, ref, state, scheduled, dependencies);
    }
}