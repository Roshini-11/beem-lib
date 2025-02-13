package com.brimmatech.dto.lead;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DuplicateLead {
    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private BigDecimal listPrice;

    private String propertyStreet;

    private String propertyState;

    private String propertyCity;

    private String propertyZip;

    private String propertyCounty;
}
