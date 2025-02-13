package com.brimmatech.dto.lead;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadStatusInfo {

    private UUID leadGuid;

    private String leadStatus;

    private String reason;

    private String lenderType;

    private String comments;

    private Long createdDate;
}
