package com.brimmatech.dto.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoanOfficer extends Person{
    @JsonProperty("loan_officer_guid")
    private String guid;

    private List<String> nmlsId;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private String orgName;
    private String orgStreet1;
    private String orgStreet2;
    private String orgCity;
    private String orgState;
    private String orgZip;

    private String fax;

    private String userId;
    private String jobTitle;

    private Boolean activeIndicator;
    private String inviteUrl;
    private List<String> roles;
    private String branchManagerEmail;
    private String regionalManagerEmail;
    private String divisionalManagerEmail;
    private Boolean hasPricingCredentials;
    private List<String> licensedStates;
    private Boolean isOptedOut;
    private Boolean enableRefinanceLeads;
}
