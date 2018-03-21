package com.aftt.dao;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Component;

import com.aftt.dto.Job;

@Component
public class JobDao  {
	
	List<Job> jobList = new ArrayList<Job>();
	List<Job> jobRepo = new ArrayList<Job>();
	
	public List<Job> getJobs(){
		final long startTime = System.currentTimeMillis();

		jobList = new ArrayList<Job>();
		
		JSONParser parser = new JSONParser();
		JSONArray jobArray = new JSONArray();
		String filePath = "";
		try {
			filePath = new File( "src/main/java/com/pel2/dao/JobList.json" ).getCanonicalPath();
		} catch (IOException e1) {e1.printStackTrace();}
		
		try {
			jobArray = (JSONArray) parser.parse(new FileReader(filePath));
		} catch (Exception e) {System.out.println(e.getMessage());}
		
		if (jobArray != null) {
			for (Object obj : jobArray) {
				JSONObject jObj = (JSONObject) obj;
				Job job = new Job();
				job.id = null;
				job.category = (String) jObj.get("category");
				job.type = (String) jObj.get("type");
				job.ref = (String) jObj.get("ref");
				job.state = Integer.parseInt(jObj.get("state").toString());
				job.scheduled = Integer.parseInt(jObj.get("scheduled").toString());
				
				JSONArray depJSONArray = (JSONArray) jObj.get("dependencies");
				ArrayList<String> depAL = new ArrayList<String>();
				for (Object depObj : depJSONArray)
			    {
					JSONObject jDepObj = (JSONObject) depObj;
			      	depAL.add((String) jDepObj.get("ref"));
			    }
				job.dependencies = depAL.toArray(new String[depAL.size()]);

				jobRepo.add(job);
			}
		}
		for (Job job : jobRepo) {
			addJob(job);
		}
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		
		return jobList;
	}
	
	private void addJob(Job job) {
		boolean exists = false;
		for (Job listJob : jobList) {
			if (listJob.equals(job))
				exists = true;
		}
		if (!exists) {
			if (job.getDependencies().length==0) {
				jobList.add(job);
			}
			else {
				for (int i=0; i < job.getDependencies().length; i++) {
					for (Job repoJob : jobRepo) {
						if (repoJob.ref.equals(job.getDependencies()[i]))
							addJob(repoJob);
					}
				}
				jobList.add(job);
			}
		}
	}
}