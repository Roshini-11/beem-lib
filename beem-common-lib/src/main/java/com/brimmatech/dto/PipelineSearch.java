package com.brimmatech.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PipelineSearch {

    @JsonProperty("search_history_id")
    private Long searchHistoryId;

    @JsonProperty("search_text")
    private String searchText;

}
