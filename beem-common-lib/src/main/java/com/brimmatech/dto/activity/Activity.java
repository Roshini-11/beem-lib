package com.brimmatech.dto.activity;

import com.brimmatech.dto.Audit;
import com.brimmatech.dto.email.Attachment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
@SuppressWarnings("PMD.ShortVariable")
public class Activity extends Audit {

    @JsonProperty("activity_id")
    private Long id;

    @JsonProperty("lead_guid")
    private UUID leadGuid;

    @JsonProperty("type")
    private String type;

    @JsonProperty("sub_type")
    private String subType;

    @JsonProperty("title")
    private String title;

    @JsonProperty("content")
    private String content;

    /*
        This hold the id of the actual resource the activity points to.
        For example, notes_guid will be saved here
    */
    @JsonProperty("resource_id")
    private String resourceId;

    private List<Attachment> attachments;
}
