package org.microq.support.auditor;

public abstract class Interchange {

    protected abstract String interchangeName();

    public String getInterchangeName(){
        return interchangeName();
    }
}
