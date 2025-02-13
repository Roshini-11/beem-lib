package com.brimmatech.dto.eligibleproduct;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {

    private UUID productGuid;

    private BigDecimal apr;
    private BigDecimal rate;
    private BigDecimal rebate;
    private BigDecimal closingCost;
    private BigDecimal credit;
    private BigDecimal discount;
    private BigDecimal price;
    private LocalDateTime lastUpdate;
    private String loanTerm;
    private Long lockPeriod;
    private BigDecimal armMargin;
    private BigDecimal principalAndInterest;
    private BigDecimal monthlyMI;
    private String amortizationTerm;
    private String amortizationType;
    private BigDecimal totalPayment;
    private Long investorId;
    private String investor;
    private String loanType;
    private String priceStatus;
    private Boolean pendingUpdate;
    private String productCode;
    private String productType;
    private Long productId;
    private String productName;
    private boolean selected;
    private boolean bestProduct;
    private String loanPurpose;
    private BigDecimal upfrontPmiMipFfGfAmount;
    private String armFixedTerm;
    private String armSubsequentChangePeriod;
    private BigDecimal totalLoanAmount;

    private QuoteAdditionalDetail details;
    private Quote quote;

    @JsonProperty("rebateDollar")
    private BigDecimal rebateForMoreRate;
    @JsonProperty("discountDollar")
    private BigDecimal discountForMoreRate;
    @JsonProperty("monthlyMi")
    private BigDecimal monthlyMIForMoreRate;
}
