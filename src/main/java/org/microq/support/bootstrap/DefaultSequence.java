package org.microq.support.bootstrap;

import org.microq.support.auditor.Sequence;


public class DefaultSequence extends Sequence {
    @Override
    protected String sequenceName() {
        return "MicroQ-Default-Sequence";
    }
}
