package com.brimmatech.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class LeadAdditionalDetail extends Audit {
    private UUID additionalLeadGuid;
    private String loanPurpose;
    private BigDecimal listPrice;
    private String loanType;
    private String representativeFICO;
    private BigDecimal downPaymentPercentage;
    private BigDecimal downPaymentAmount;
    private BigDecimal ltv;
    private BigDecimal baseLoanAmount;
    private String propertyType;
    private String occupancy;
    private Boolean firstTimeHomeBuyer;
    private Boolean selfEmployed;
    private Boolean waiveEscrows;
    private BigDecimal monthlyIncome;
    private Boolean currentlyOwnHome;
    private Boolean current2ndMortgage;
    private BigDecimal secondMortgageBalance;
    private String timeFrameToBuy;
    private BigDecimal loanLevelDebtToIncomeRatio;
    private String typeOfVeteran;
    private Boolean vaFirstTimeUse;
    private Boolean exemptFromVAFundingFee;

    private String coBorrowerEstimatedFICOScore;
    private Boolean coBorrowerSelfEmployed;
    private BigDecimal coBorrowerMonthlyIncome;

    private String searchId;

    private List<String> amortizationTypes;
    private List<String> armFixedTerms;
    private List<String> loanTerms;

    private String county;
    private String state;
    private String zip;

    private String browserTime;

    private String leadGeneratedBy;
}
