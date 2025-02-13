package com.brimmatech.dto.twilio;

import com.brimmatech.dto.lead.Lead;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class ConversationRequest {

    private Lead lead;

    private String content;

    private String author;

    private List<String> nmlsId;


}
