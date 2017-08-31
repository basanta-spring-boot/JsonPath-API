
package com.spring.json.path.api.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "book",
    "bicycle"
})
public class Store implements Serializable
{

    @JsonProperty("book")
    private List<Book> book = null;
    @JsonProperty("bicycle")
    private Bicycle bicycle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3333485716540671321L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Store() {
    }

    /**
     * 
     * @param book
     * @param bicycle
     */
    public Store(List<Book> book, Bicycle bicycle) {
        super();
        this.book = book;
        this.bicycle = bicycle;
    }

    @JsonProperty("book")
    public List<Book> getBook() {
        return book;
    }

    @JsonProperty("book")
    public void setBook(List<Book> book) {
        this.book = book;
    }

    @JsonProperty("bicycle")
    public Bicycle getBicycle() {
        return bicycle;
    }

    @JsonProperty("bicycle")
    public void setBicycle(Bicycle bicycle) {
        this.bicycle = bicycle;
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
