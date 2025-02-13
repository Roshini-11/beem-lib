package com.brimmatech.dto.lead;

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
public class LeadStatus {

    private LeadStatusCode code;
    private String description;
    private Integer level;
    private String value;
    private String reason;
}
