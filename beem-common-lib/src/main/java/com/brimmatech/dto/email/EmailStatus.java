package com.brimmatech.dto.email;

import lombok.Getter;

@Getter
public enum EmailStatus {

    INQUEUE("In Queue"),
    SENT("Sent"),
    DELIVERED("Delivered"),
    READ("Read");


    private String value;

    EmailStatus(String value) {
        this.value = value;
    }

}
