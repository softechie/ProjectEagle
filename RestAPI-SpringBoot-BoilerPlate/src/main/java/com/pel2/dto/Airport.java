/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pel2.dto;

import java.util.Map;

import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import lombok.Data;

/**
 *
 * @author softechie (Suresh V)
 */

@Component
@Document
@Data
public class Airport {

	@Id
	@Field
	private String id;
	@Field
	private String airportname;
	@Field
	private String city;
	@Field
	private String country;
	@Field
	private String faa;
	@Field
	private Map geo;
	@Field
	private String icao;
	@Field("tz")
	private String timezone;
	@Field
	private String type;

	public Airport() {
	}

	public String toString() {
		String printBean = "type=" + type + " id=" + id + " airportname=" + airportname + " city=" + city + " country="
				+ country + " faa=" + faa + " icao=" + icao + " tz=" + timezone + "geo =" + geo.toString();
		return printBean;
	}

}
