package com.brimmatech.dto.email;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class Attachment {
    private UUID quoteGuid;
    private UUID productGuid;
    private String productName;
    private String fileName;
}
