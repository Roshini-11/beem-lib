package com.brimmatech.dto.logins;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoginLogDto {

    @JsonProperty("session_id")
    private String sessionId;

    @JsonProperty("email_address")
    private String emailAddress;

    @JsonProperty("login_timestamp")
    private Long loginTimestamp;

    @JsonProperty("operating_system")
    private String operatingSystem;

    @JsonProperty("browser")
    private String browser;

    @JsonProperty("client_ip")
    private String clientIp;

    @JsonProperty("display_resolution")
    private String displayResolution;

    @JsonProperty("login_status")
    private String loginStatus;

    @JsonProperty("logout_timestamp")
    private Long logoutTimestamp;

}
