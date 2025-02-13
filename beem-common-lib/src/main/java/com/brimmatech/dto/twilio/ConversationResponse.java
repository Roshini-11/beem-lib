package com.brimmatech.dto.twilio;

import com.brimmatech.dto.conversation.TextMessage;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversationResponse {

    private String conversationId;
    private List<TextMessage> messages;
}
