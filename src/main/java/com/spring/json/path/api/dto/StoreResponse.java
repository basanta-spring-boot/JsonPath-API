package com.spring.json.path.api.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "store" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreResponse implements Serializable {

	@JsonProperty("store")
	private Store store;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -5754912191705672038L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public StoreResponse() {
	}

	/**
	 * 
	 * @param store
	 */
	public StoreResponse(Store store) {
		super();
		this.store = store;
	}

	@JsonProperty("store")
	public Store getStore() {
		return store;
	}

	@JsonProperty("store")
	public void setStore(Store store) {
		this.store = store;
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
