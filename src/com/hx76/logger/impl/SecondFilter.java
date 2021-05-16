package com.hx76.logger.impl;

import com.hx76.logger.AbstractFilter;

public class SecondFilter extends AbstractFilter {
    public SecondFilter(int level) {
        this.level=level;
    }

    @Override
    public void write(String msg) {
        System.out.println("SecondFilter: "+msg);
    }
}
