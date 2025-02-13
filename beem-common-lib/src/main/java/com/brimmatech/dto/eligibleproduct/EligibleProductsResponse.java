package com.brimmatech.dto.eligibleproduct;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class EligibleProductsResponse {

    @JsonProperty("additional_lead_details_guid")
    private UUID additionalLeadDetailsGuid;

    @JsonProperty("lead_guid")
    private UUID leadGuid;

    @JsonProperty("borrower_name")
    private String borrowerName;

    @JsonProperty("purpose_type")
    private String loanPurpose;

    @JsonProperty("eligible_products")
    private List<Product> eligibleProducts;

}
