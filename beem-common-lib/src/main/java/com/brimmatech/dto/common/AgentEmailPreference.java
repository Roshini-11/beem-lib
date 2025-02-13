package com.brimmatech.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class AgentEmailPreference {

    @JsonProperty("email")
    private String email;

    @JsonProperty("is_first_communication_enabled")
    private boolean isFirstCommunicationEnabled;
}
