package com.bonusapilab.BonusAPILab.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FactType {

	private String text;
	private String number;
	private String found;
	private String type;

	public FactType() {

	}

	public FactType(String text, String number, String found, String type) {
		super();
		this.text = text;
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
		return "FactType [text=" + text + ", number=" + number + ", found=" + found + ", type=" + type + "]";
	}

}
