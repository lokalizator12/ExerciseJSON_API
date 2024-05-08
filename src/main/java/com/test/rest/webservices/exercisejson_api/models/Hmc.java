package com.test.rest.webservices.exercisejson_api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hmc {

    private int x;
    private int y;
    private int z;
    @JsonProperty("manufacturer")
    private String modelManufaktur;
    private String model;

    @Override
    public String toString() {
        return "Hmc{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", modelManufaktur='" + modelManufaktur + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
