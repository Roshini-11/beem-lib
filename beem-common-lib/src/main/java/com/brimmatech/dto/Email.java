package com.brimmatech.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@SuppressWarnings("PMD.ShortVariable")
public class Email {

    private UUID emailId;

    private String from;
    private List<String> to;
    private List<String> cc;
    private List<String> bcc;

    private String subject;
    private String bodyContent;

    private List<String> attachments;
}
