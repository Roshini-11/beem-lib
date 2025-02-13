package com.brimmatech.dto.tasksubject;

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
public class TaskSubject {

    @JsonProperty("task_subject_name")
    private String taskSubjectName;

    @JsonProperty("task_subject_guid")
    private UUID taskSubjectGuid;

}
