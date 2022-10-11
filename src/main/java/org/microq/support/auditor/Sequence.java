package org.microq.support.auditor;

public abstract class Sequence {

    protected abstract String sequenceName();

    public String getSequenceName(){
        return sequenceName();
    }
}
