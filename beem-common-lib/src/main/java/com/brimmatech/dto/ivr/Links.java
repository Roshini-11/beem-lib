package com.brimmatech.dto.ivr;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Links {
    private String steps;
    @JsonProperty("execution_context")
    private String executionContext;
}
