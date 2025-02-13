package com.brimmatech.dto.twilio;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
@SuppressWarnings("PMD.ShortVariable")
public class TwilioOptOutEventMessage {
    private String smsMessageSid;
    private String optOutType;
    private String body;
    private String status;
    private String from;
    private String to;
}
