package com.brimmatech.dto.lead;

import com.brimmatech.dto.Note;
import com.brimmatech.dto.appconfig.LeadSource;
import com.brimmatech.dto.common.Agent;
import com.brimmatech.dto.common.Person;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("PMD.ShortVariable")
public class PipelineLead {

    @JsonProperty("lead_guid")
    private String leadGuid;

    @JsonProperty("is_opt_out_for_sms")
    private Boolean isOptOutForSms;

    @JsonProperty("is_opt_out_for_email")
    private Boolean isOptOutForEmail;

    @JsonProperty("borrower")
    private Person borrower;

    @JsonProperty("attempts_count")
    private Short attemptsCount;

    @JsonProperty("last_attempted_time")
    private Long lastAttemptedTime;

    @JsonProperty("status")
    private LeadStatus leadStatus;

    @JsonProperty("contact_details")
    private LeadContact leadContact;

    @JsonProperty("conversation_id")
    private String conversationId;

    @JsonProperty("lead_source")
    private LeadSource leadSource;

    @JsonProperty("agent")
    private Agent agent;

    @JsonProperty("note")
    private Note note;

    @JsonProperty("lead_created_date")
    private Long leadCreatedDate;
}
