package com.test.rest.webservices.exercisejson_api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Embedded {
    @JsonProperty("hmc_")
    private List<Hmc> hmcs;

    @Override
    public String toString() {
        return "Embedded{" +
                "hmcs=" + hmcs +
                '}';
    }
}
