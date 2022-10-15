package org.microq.support.auditor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class Interchange extends AbstractDeclarable {

    private String interchangeName;

    public Interchange(String interchangeName) {
        this.interchangeName = interchangeName;
    }
}
