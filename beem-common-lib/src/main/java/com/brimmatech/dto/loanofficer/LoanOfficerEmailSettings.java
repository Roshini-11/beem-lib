package com.brimmatech.dto.loanofficer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class LoanOfficerEmailSettings {

   private List<LoanOfficerEmailAddresses> loanOfficerEmailAddresses;

    private int emailCount;
}
