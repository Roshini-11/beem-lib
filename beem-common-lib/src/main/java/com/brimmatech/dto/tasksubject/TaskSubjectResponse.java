package com.brimmatech.dto.tasksubject;

import com.brimmatech.dto.ApplicationConfig;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class TaskSubjectResponse extends ApplicationConfig{

    private Boolean isCustomSubject;

}
