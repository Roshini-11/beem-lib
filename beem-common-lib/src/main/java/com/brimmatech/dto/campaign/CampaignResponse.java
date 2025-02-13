package com.brimmatech.dto.campaign;

import com.brimmatech.dto.ApplicationConfig;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class CampaignResponse extends ApplicationConfig{

    private Boolean standard;

    private Boolean individual;

    private UUID loanOfficerGuid;

}
