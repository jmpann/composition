package com.company;

/**
 * Created by flatironschool on 4/10/17.
 */
public class Alarm {
    private String style;
    private boolean battery;
    private int volume;
    private boolean active;
    private String time;

    public Alarm(String style, boolean battery, int volume) {
        this.style = style;
        this.battery = battery;
        this.volume = volume;
    }

    public void setActive (String time){
        this.active = true;
        this.time = time;
        System.out.println("Alarm is set for " + time);
    }

    public void wakeUp(){
        System.out.println("RING RING, RING RING. It is " + this.time);
    }

    public void turnOff(){
        System.out.println("Turning off Alarm");
        this.active = false;
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
