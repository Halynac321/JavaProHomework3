package com.hillel.homework3;

public class Cats extends Animals {
    static int catsCount;

    public Cats(String name) {
        super(name);
        this.maxLengthDistanceRun = 200;
        catsCount++;
    }

    @Override
    public void swim(double lengthDistanceSwim){
        System.out.println(this.name + " це ж кіт, а коти не вміють плавати");
    }

}
