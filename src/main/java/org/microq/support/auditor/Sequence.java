package org.microq.support.auditor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public  class Sequence extends AbstractDeclarable{

    private String sequenceName;

    public Sequence(String sequenceName) {
        this.sequenceName = sequenceName;
    }
}
