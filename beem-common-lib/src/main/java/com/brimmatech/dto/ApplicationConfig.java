package com.brimmatech.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplicationConfig {

    private String type;
    private String label;
    private String value;
    private Integer sortPosition;
    private Boolean defaultValue;
    private String fieldParam1;
}
