package com.brimmatech.dto.lead;

import lombok.Getter;

@SuppressWarnings("PMD.SingularField")
@Getter
public enum LeadStatusCode {
    NEW("New"),
    OVERDUE("Overdue"),
    ATTENTION_REQUIRED("Attention Required"),
    QUALIFIED("Qualified"),
    NOT_RESPONDING("Not Responding"),
    CONTACTED("Contacted"),
    CALL_PENDING("Call Pending"),
    APPOINTMENT_SET("Appointment Set"),
    ARCHIVED_LEAD("Archive Lead"),
    LEAD_DEAD("Lead Dead"),
    ATTEMPTING_TO_CONTACT("Attempting to Contact"),
    APPLICATION_RECEIVED("Application Received"),
    CLOSED("Closed"),
    UNDER_CONTRACT("Under Contract"),
    TRANSFERRED("Transferred");

    private String name;

    LeadStatusCode(String name){
        this.name = name;
    }

    public LeadStatusCode getLeadStatusCode(String name){
        return LeadStatusCode.valueOf(name);
    }
    public static String getLabelByStatus(String status) {
        String label = null;
        for (LeadStatusCode code : values()) {
            if (code.name().equalsIgnoreCase(status)) {
                label = code.getName();
            }
        }
        return label;
    }

}
