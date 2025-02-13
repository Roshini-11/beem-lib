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
public class CallDTO {
    private  String sid;
    private  String to;
    private  String from;
    private  String status;
    private String callDuration;
    private String twilioNumber;
    private String type;
    private String person;
    private String loCallStatus;
    private String loCallDuration;
    private String loCallSid;

}
