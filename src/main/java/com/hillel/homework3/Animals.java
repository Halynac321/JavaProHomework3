package com.hillel.homework3;

public class Animals {
    double maxLengthDistanceRun;
    double maxLengthDistanceSwim;
    String name;
    static int count;
    public Animals(String name){
        this.name = name;
        count++;
    }
    public void run(double lengthDistanceRun){
        if(lengthDistanceRun <= maxLengthDistanceRun) {
            System.out.println(this.name + " пробіг: " + lengthDistanceRun);
        } else{
            System.out.println(this.name + " не зможе пробігти "  + lengthDistanceRun + " м.");
        }
    }

    public void swim(double lengthDistanceSwim){
        if(lengthDistanceSwim <= maxLengthDistanceSwim) {
        System.out.println(this.name + " проплив: " + lengthDistanceSwim + " м.");
    } else{
        System.out.println(this.name + " не зможе проплисти " + + lengthDistanceSwim + " м.");
    }
    }
}
