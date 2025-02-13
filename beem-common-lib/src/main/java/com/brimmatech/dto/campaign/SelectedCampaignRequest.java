package com.brimmatech.dto.campaign;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class SelectedCampaignRequest {

    @JsonProperty("campaign_id")
    private UUID campaignId;

    @JsonProperty("loan_officer_guid")
    private UUID loanOfficerGuid;

    @JsonProperty("lead_source_guid")
    private UUID leadSourceGuid;

    @JsonProperty("selected")
    private Boolean selected;
}
