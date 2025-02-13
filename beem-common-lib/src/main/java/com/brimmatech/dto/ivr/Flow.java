package com.brimmatech.dto.ivr;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@SuppressWarnings("PMD.ShortVariable")
public class Flow {
    private String sid;
    private String flowSid;
    private String callSid;
    private String callStatus;
    private String callDuration;
    private String to;
    private String from;
    private String type;
    private String person;
    private String loCallStatus;
    private String loCallDuration;
    private String loCallSid;

}
