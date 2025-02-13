package com.brimmatech.dto.loanofficer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoanOfficerEmailAddresses {
    private String emailId;

    private Boolean isPrimaryEmail;
}

