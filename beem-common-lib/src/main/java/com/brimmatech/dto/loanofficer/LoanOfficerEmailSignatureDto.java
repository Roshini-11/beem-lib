package com.brimmatech.dto.loanofficer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoanOfficerEmailSignatureDto {
    public String htmlContent;
    public String loEmail;
    public UUID loanOfficerGuid;
}
