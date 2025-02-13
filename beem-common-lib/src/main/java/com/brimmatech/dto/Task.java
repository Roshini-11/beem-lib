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
public class Task extends Audit{

    @JsonProperty("task_guid")
    private String guid;

    @JsonProperty("lead_guid")
    private UUID lead;

    @JsonProperty("due_date_time")
    private Long dueDateTime;

    private String subject;

    private String type;

    private String status;

    @JsonProperty("send_notification_email_flag")
    private Boolean sendNotificationEmailFlag;

    @JsonProperty("send_in_app_notification_flag")
    private Boolean sendInAppNotificationFlag;

    @JsonProperty("send_notification_text_flag")
    private Boolean sendNotificationTextFlag;

    @JsonProperty("open_task")
    private Boolean openTask;

    @JsonProperty("manual_task")
    private Boolean manualTask;
}
