package com.brimmatech.dto.call;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CallRequest {
    private UUID leadGuid;
    private String leadName;
    private String loanOfficerName;
    private String leadPhone;
    private String loanOfficerPhone;
    private String agentName;
}
