package org.microq.support.bootstrap;

import org.microq.support.auditor.Interchange;


public class DefaultInterchange extends Interchange {
    @Override
    protected String interchangeName() {
        return "MicroQ-Default-Interchange";
    }
}
