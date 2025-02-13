package com.brimmatech.dto.ivr;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class FlowResponse {
    private String status;
    @JsonProperty("date_updated")
    private LocalDateTime dateUpdated;
    @JsonProperty("contact_channel_address")
    private String contactChannelAddress;
    @JsonProperty("account_sid")
    private String accountSid;
    private String url;
    private String sid;
    @JsonProperty("date_created")
    private LocalDateTime dateCreated;
    @JsonProperty("flow_sid")
    private String flowSid;
    private Links links;


}
