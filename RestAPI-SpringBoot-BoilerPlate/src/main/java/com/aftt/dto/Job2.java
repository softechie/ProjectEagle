package com.aftt.dto;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jobs2")
public class Job2 {

    @Id
    public String id;

    public String category;
    public String type;
    public String ref;
    public int state;
    public int scheduled;
    public JSONArray dependencies;

	public Job2() {}
	public Job2(String id, String category, String type, String ref, int state, int scheduled, JSONArray dependencies) {
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
	public JSONArray getDependencies() {
		return dependencies;
	}
	public void setDependencies(JSONArray dependencies) {
		this.dependencies = dependencies;
	}
	@Override
    public String toString() {
        return String.format(
                "Job[id=%s, category='%s', type='%s', ref='%s', state='%d', scheduled='%d', dependencies='%s']",
                id, category, type, ref, state, scheduled, dependencies);
    }
	
}