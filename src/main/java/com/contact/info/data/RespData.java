package com.contact.info.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RespData {
    @JsonProperty("dafirst")
    private String first;
    @JsonIgnore
    private String second;
    private List<String> items;

    public RespData(String first, String second, List<String> items) {
        this.first = first;
        this.second = second;
        this.items = items;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public List<String> getItems() {
        return items;
    }
}
