package com.brimmatech.dto.twilio;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class TwilioEventMessage implements Serializable {

    private String eventType;
    private String conversationId;
    private String messageId;
    private String status;
    private String updatedOn;

    private String author;
    private String content;
    private String createdOn;
}
