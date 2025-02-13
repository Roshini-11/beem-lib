package com.brimmatech.dto.loanofficer;

import com.brimmatech.dto.common.AgentEmailPreference;
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
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanOfficerUserSettings{
    @JsonProperty("loan_officer_guid")
    private UUID loanOfficerGuid;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("business_Channel_id")
    private String businessChannelId;

    @JsonProperty("originator_id")
    private String originatorId;

    @JsonProperty("is_conversation_enabled")
    private Boolean isConversationEnabled;

    private LoanOfficerEmailSettings emailConfig;

    @JsonProperty("send_auto_email_to_agent")
    private Boolean sendAutoEmailToAgent;

    @JsonProperty("enable_sms")
    private Boolean enableSms;

    @JsonProperty("enable_call")
    private Boolean enableCall;

    @JsonProperty("enable_email")
    private Boolean enableEmail;

    @JsonProperty("enable_notification")
    private Boolean enableNotification;

    @JsonProperty("except_agent_email")
    private List<AgentEmailPreference> exceptAgentEmail;

    @JsonProperty("auto_dialer_delay_time")
    private Integer autoDialerDelayTime;

    @JsonProperty("enable_auto_dialer_delay")
    private Boolean enableAutoDialer;

    @JsonProperty("send_auto_email_to_proxy")
    private Boolean sendAutoEmailToProxy;

    @JsonProperty("included_proxy_emails")
    private List<String> includedProxyEmails;

}
