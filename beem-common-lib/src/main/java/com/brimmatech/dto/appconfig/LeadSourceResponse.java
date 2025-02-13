package com.brimmatech.dto.appconfig;

import com.brimmatech.dto.ApplicationConfig;
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
public class LeadSourceResponse extends ApplicationConfig{

    private Boolean isManualLead;

    private Boolean isStandardLeadSourceManual;

    private Boolean isStandardLeadSourceAutomate;

    private Boolean isSmsEnabled;

    private Boolean isCallEnabled;

    private Boolean isEmailEnabled;

}
