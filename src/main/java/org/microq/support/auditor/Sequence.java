package org.microq.support.auditor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@Data
public abstract class Sequence {

    protected abstract String sequenceName();

    public String getSequenceName(){
        return sequenceName();
    }
}
