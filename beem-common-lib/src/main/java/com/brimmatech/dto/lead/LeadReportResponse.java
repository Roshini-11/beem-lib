package com.brimmatech.dto.lead;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadReportResponse {

    @JsonProperty("status")
    private String status;

    @JsonProperty("label")
    private String label;

    @JsonProperty("leadCount")
    private long leadCount;
}
