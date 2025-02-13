package com.brimmatech.dto.ivr;

import lombok.Getter;

@Getter
public final class CallStatusConstants {

    public static final String QUEUED = "QUEUED";
    public static final String RINGING = "RINGING";
    public static final String IN_PROGRESS = "IN_PROGRESS";
    public static final String COMPLETED = "COMPLETED";
    public static final String BUSY = "BUSY";
    public static final String FAILED = "FAILED";
    public static final String NO_ANSWER = "NO_ANSWER";
    public static final String CANCELED = "CANCELLED";
    public static final String ATTEMPTING_TO_CONTACT = "ATTEMPTING_TO_CONTACT";

}
