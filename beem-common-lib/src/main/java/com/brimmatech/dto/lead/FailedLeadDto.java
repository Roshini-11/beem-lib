package com.brimmatech.dto.lead;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FailedLeadDto {

    @JsonProperty("failed_lead_guid")
    private UUID failedLeadGuid;

    @JsonProperty("lead_details")
    private String leadDetails;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("status")
    private String status;


}
