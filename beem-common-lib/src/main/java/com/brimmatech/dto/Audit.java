package com.brimmatech.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Audit {

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("created_on")
    private Long createdOn;

    @JsonProperty("updated_by")
    private String updatedBy;

    @JsonProperty("updated_on")
    private Long updatedOn;
}
