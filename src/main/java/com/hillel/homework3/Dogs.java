package com.hillel.homework3;

public class Dogs extends Animals {
    static int dogsCount;
    public Dogs(String name) {
        super(name);
        this.maxLengthDistanceRun = 500;
        this.maxLengthDistanceSwim = 10;
        dogsCount++;
    }
}
