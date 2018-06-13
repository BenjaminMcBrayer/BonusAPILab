package com.bonusapilab.BonusAPILab.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fact {

	private String text;
	private String year;
	private String number;
	private String found;
	private String type;

	public Fact() {

	}

	public Fact(String text, String year, String number, String found, String type) {
		super();
		this.text = text;
		this.year = year;
		this.number = number;
		this.found = found;
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFound() {
		return found;
	}

	public void setFound(String found) {
		this.found = found;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Fact [text=" + text + ", year=" + year + ", number=" + number + ", found=" + found + ", type=" + type
				+ "]";
	}

}
