package com.hx76.logger.impl;

import com.hx76.logger.AbstractFilter;

public class FirstFilter extends AbstractFilter {
    public FirstFilter(int level) {
        this.level=level;
    }

    @Override
    public void write(String msg) {
        System.out.println("FirstFilter: "+msg);
    }
}
