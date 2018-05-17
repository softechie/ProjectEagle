package com.springboot.dto;

import org.json.simple.JSONArray;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jobs")
public class Job {

    @Id
    public String id;

    private String category;
    private String name;
    private String ref;
    private String status;
    private String scheduled;
    private JSONArray dependencies;

	public Job() {}
	public Job(String id, String category, String name, String ref, String status, String scheduled, JSONArray dependencies) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.ref = ref;
		this.status = status;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getScheduled() {
		return scheduled;
	}
	public void setScheduled(String scheduled) {
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
                "Job[id=%s, category='%s', name='%s', ref='%s', status='%s', scheduled='%s', dependencies='%s']",
                id, category, name, ref, status, scheduled, dependencies);
    }
	
}