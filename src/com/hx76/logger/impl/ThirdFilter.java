package com.hx76.logger.impl;

import com.hx76.logger.AbstractFilter;

public class ThirdFilter extends AbstractFilter {
    public ThirdFilter(int level) {
        this.level=level;
    }

    @Override
    public void write(String msg) {
        System.out.println("ThirdFilter: "+msg);
    }
}
