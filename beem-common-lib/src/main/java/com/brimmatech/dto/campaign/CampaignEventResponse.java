package com.brimmatech.dto.campaign;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class CampaignEventResponse {
    @JsonProperty("event_id")
    private UUID eventId;

    @JsonProperty("campaign_id")
    private UUID campaignId;

    private String type;

    @JsonProperty("trigger_after")
    private Integer triggerAfter;

    @JsonProperty("is_on_lead_creation")
    private Boolean isOnLeadCreation;

    @JsonProperty("event_name")
    private String eventName;

    @JsonProperty("sort_position")
    private Integer sortPosition;
}
