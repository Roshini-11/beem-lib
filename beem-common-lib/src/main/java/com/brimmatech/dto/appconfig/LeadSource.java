package com.brimmatech.dto.appconfig;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class LeadSource {

    @JsonProperty("lead_source_guid")
    private UUID leadSourceGuid;

    @JsonProperty("lead_source_name")
    private String leadSourceName;

    @JsonProperty("is_auto_intro_call_enabled")
    private Boolean isAutoIntroCallEnabled;

    @JsonProperty("is_auto_intro_SMS_enabled")
    private Boolean isAutoIntroSMSEnabled;

    @JsonProperty("is_auto_intro_email_enabled")
    private Boolean isAutoIntroEmailEnabled;

    @JsonProperty("last_updated_by")
    private String lastUpdatedBy;

    @JsonProperty("last_updated_date_time")
    private LocalDateTime lastUpdatedDateTime;

    @JsonProperty("is_manual_lead")
    private Boolean isManualLead;

    @JsonProperty("is_standard_lead_source")
    private Boolean isStandardLeadSource;

}
