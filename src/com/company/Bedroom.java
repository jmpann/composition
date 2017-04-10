package com.company;

/**
 * Created by flatironschool on 4/10/17.
 */
public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Alarm alarm;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Alarm alarm) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.alarm = alarm;
    }

    public Alarm getAlarm(){
        return this.alarm;
    }

    public void makeBed(){
        System.out.println("Making Bed");
        bed.make();

    }
}
