package org.microq.support.auditor;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
public abstract class Interchange {

    protected abstract String interchangeName();

    public String getInterchangeName(){
        return interchangeName();
    }
}
