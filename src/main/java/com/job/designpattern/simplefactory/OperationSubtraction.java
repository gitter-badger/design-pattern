package com.job.designpattern.simplefactory;

public class OperationSubtraction extends Operation {
    @Override
    public double calc() {
        return super.getNumberA() - super.getNumberB();
    }
}
