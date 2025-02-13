package com.brimmatech.dto.eligibleproduct;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Quote {

    private UUID quoteGuid;
    private UUID additionalDetailId;
    private BigDecimal estPropertyTax;
    private BigDecimal estHomeownersInsurance;
    private BigDecimal totalMonthlyPayment;
    private BigDecimal underwritingFee;
    private BigDecimal processingFee;
    private BigDecimal administrationFee;
    private BigDecimal applicationFee;
    private BigDecimal lenderCredit;
    private BigDecimal appraisalFee;
    private BigDecimal creditReportFee;
    private BigDecimal closingFee;
    private BigDecimal titleInsurance;
    private BigDecimal notaryFee;
    private BigDecimal recordingFee;
    private BigDecimal totalClosingCosts;

    private BigDecimal interestDays;
    private BigDecimal interestRate;
    private BigDecimal totalPrepaidInterest;
    private BigDecimal hazardInsurance;
    private BigDecimal propertyTaxesRate;
    private BigDecimal propertyTaxesMonths;
    private BigDecimal propertyTaxesMonthly;
    private BigDecimal homeOwnersInsuranceMonthlyRate;
    private BigDecimal homeOwnersInsuranceMonths;
    private BigDecimal homeOwnersInsuranceMonthly;
    private BigDecimal pricingConcession;
    private String fileName;
}
