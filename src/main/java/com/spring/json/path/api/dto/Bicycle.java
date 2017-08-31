package com.spring.json.path.api.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "color", "price" })
public class Bicycle implements Serializable {

	@JsonProperty("color")
	private String color;
	@JsonProperty("price")
	private double price;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -9162657259536917637L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Bicycle() {
	}

	/**
	 * 
	 * @param price
	 * @param color
	 */
	public Bicycle(String color, double price) {
		super();
		this.color = color;
		this.price = price;
	}

	@JsonProperty("color")
	public String getColor() {
		return color;
	}

	@JsonProperty("color")
	public void setColor(String color) {
		this.color = color;
	}

	@JsonProperty("price")
	public double getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(double price) {
		this.price = price;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
