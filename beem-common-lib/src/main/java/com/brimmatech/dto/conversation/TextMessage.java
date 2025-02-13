package com.brimmatech.dto.conversation;

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
public class TextMessage {

    private String messageId;
    private String conversationId;

    private UUID leadGuid;

    private String fromNumber;
    private String fromName;

    private String toNumber;
    private String toName;

    private Long createdOn;

    private String status;
    private String content;

    private boolean loSent;
}