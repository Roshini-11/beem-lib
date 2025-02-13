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
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuoteAdditionalDetail {

    private UUID quoteGuid;

    private UUID productGuid;
    private UUID leaddAdditionalDetailsGuid;


    private BigDecimal loanAmount;
    private BigDecimal purchasePrice;
    private BigDecimal downPayment;

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
}
