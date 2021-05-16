package com.hx76.logger;

import com.hx76.logger.impl.FirstFilter;
import com.hx76.logger.impl.SecondFilter;
import com.hx76.logger.impl.ThirdFilter;

public abstract class AbstractFilter {
    public static final int FIRST=1;
    public static final int SECOND=2;
    public static final int THIRD=3;

    protected int level;

    AbstractFilter nextFilter;

    public void setNextFilter(AbstractFilter nextFilter) {
        this.nextFilter = nextFilter;
    }

    public void log(int level, String msg){
        if (this.level<=level){
            write(msg);
        }
        if (nextFilter!=null){
            nextFilter.log(level,msg);
        }
    };

    public abstract void write(String msg);

    public static AbstractFilter getChainOfFilter(){
        AbstractFilter firstFilter = new FirstFilter(3);
        AbstractFilter secondFilter = new SecondFilter(2);
        AbstractFilter thirdFilter = new ThirdFilter(1);

        firstFilter.setNextFilter(secondFilter);
        secondFilter.setNextFilter(thirdFilter);

        return firstFilter;
    }
}
