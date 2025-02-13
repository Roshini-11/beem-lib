package com.brimmatech.dto.ivr;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CallBackRequest {
    private Flow flow;
}
