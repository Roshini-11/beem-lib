package com.brimmatech.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@SuppressWarnings("PMD.ShortVariable")
public class Note extends Audit{

    @JsonProperty("notes_guid")
    private UUID guid;

    @JsonProperty("lead_id")
    private UUID lead;

    private String content;

    private Boolean isNotesEmailSendToAgent;

    private Boolean isEmailSent;
}
