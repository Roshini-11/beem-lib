package com.brimmatech.dto.loanofficer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoanOfficerDetails {

    private String htmlContent;

    private Boolean activeIndicator;
    private Boolean isBranchManager;
    private Boolean isRegionalManager;
    private Boolean isDivisionalManager;

    private String firstName;

    private String lastName;

    private String phone;

    private String fax;

    private String userId;

    private String jobTitle;

    private String orgName;

    private String orgStreet1;
    private String orgStreet2;
    private String orgCity;
    private String orgState;
    private String orgZip;

    private String inviteUrl;
    private String branchManagerEmail;
    private String regionalManagerEmail;
    private String divisionalManagerEmail;
    private String secondaryEmail;

    private String region;
}
