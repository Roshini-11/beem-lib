package com.brimmatech.dto.lead;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadContact {

    @JsonProperty("last_attempted")
    private long lastAttempted;

    @JsonProperty("method_of_contact")
    private String methodOfContact;

    @JsonProperty("auto_sms")
    private Boolean autoSmsSent;

    @JsonProperty("auto_email")
    private Boolean autoEmailSent;

    @JsonProperty("auto_call")
    private Boolean autoCallSent;
}
