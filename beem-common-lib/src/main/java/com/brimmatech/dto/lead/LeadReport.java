package com.brimmatech.dto.lead;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LeadReport {
    @JsonProperty("lead_status")
    private String leadStatus;
    @JsonProperty("lead_count")
    private long leadCount;
}
