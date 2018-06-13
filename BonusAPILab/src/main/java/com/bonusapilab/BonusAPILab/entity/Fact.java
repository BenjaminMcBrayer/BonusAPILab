package com.bonusapilab.BonusAPILab.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fact {

	private String day;
	private String month;
	private String fragment;
	private String json;

	public Fact() {

	}

	public Fact(String day, String month, String fragment, String json) {
		super();
		this.day = day;
		this.month = month;
		this.fragment = fragment;
		this.json = json;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getFragment() {
		return fragment;
	}

	public void setFragment(String fragment) {
		this.fragment = fragment;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	@Override
	public String toString() {
		return "Fact [day=" + day + ", month=" + month + ", fragment=" + fragment + ", json=" + json + "]";
	}

}
