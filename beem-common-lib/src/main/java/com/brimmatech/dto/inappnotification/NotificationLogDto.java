package com.brimmatech.dto.inappnotification;


import com.fasterxml.jackson.annotation.JsonInclude;
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
public class NotificationLogDto {

    private UUID notificationGuid;

    private String subject;

    private String content;

    private Boolean status;

    private String type;

    private String leadGuid;

    private UUID loanOfficerGuid;

}
