package com.brimmatech.dto.lead;

import com.brimmatech.dto.Audit;
import com.brimmatech.dto.activity.Activity;
import com.brimmatech.dto.common.Agent;
import com.brimmatech.dto.common.LoanOfficer;
import com.brimmatech.dto.common.Person;
import com.brimmatech.dto.common.Property;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class Lead extends Audit {

    @JsonProperty("lead_guid")
    private UUID leadGuid;

    @JsonProperty("borrower")
    private Person borrower;

    @JsonProperty("co_borrower")
    private Person coBorrower;

    @JsonProperty("agent")
    private Agent agent;

    @JsonProperty("loan_officer")
    private LoanOfficer loanOfficer;

    @JsonProperty("lead_status")
    private LeadStatus status;

    @JsonProperty("property")
    private Property property;

    @JsonProperty("conversation_id")
    private String conversationId;

    @JsonProperty("lead_source")
    private String leadSource;

    @JsonProperty("intro_milestones")
    private List<Activity> activity;

    @JsonProperty("invite_url")
    private String inviteUrl;

    @JsonProperty("is_opt_out_for_sms")
    private Boolean isOptOutForSms;

    @JsonProperty("tour_checkout_time")
    private Long tourCheckoutTime;
}
