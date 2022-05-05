package com.xjz.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryVo {
    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;
}
