package com.rl.limiteservice.bean;

/**
 * @author rodrigo
 * @version 1.0
 * @since 07/10/2019
 */
public class LimitConfiguration {
    private int maximum;
    private int minimun;

    public LimitConfiguration(){

    }

    public LimitConfiguration(int maximum, int minimun) {
        this.maximum = maximum;
        this.minimun = minimun;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimun() {
        return minimun;
    }
}
