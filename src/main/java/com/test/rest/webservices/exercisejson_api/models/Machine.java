package com.test.rest.webservices.exercisejson_api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Machine {

    @JsonProperty("_embedded")
    private Embedded embedded;

    @Override
    public String toString() {
        return "Machine{" +
                "_embedded=" + embedded +
                '}';
    }
}
