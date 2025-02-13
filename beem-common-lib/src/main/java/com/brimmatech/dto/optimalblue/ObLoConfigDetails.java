package com.brimmatech.dto.optimalblue;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class ObLoConfigDetails {

    @JsonProperty("loan_officer_guid")
    private UUID loanOfficerGuid;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("email_address")
    private String emailAddress;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("access_level")
    private String accessLevel;

    @JsonProperty("business_channel_id")
    private String businessChannelId;

    @JsonProperty("originator_id")
    private String originatorId;

    @JsonProperty("created_date_time")
    private String createdDateTime;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("business_channel_name")
    private String businessChannelName;
}
