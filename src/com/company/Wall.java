package com.company;

/**
 * Created by flatironschool on 4/10/17.
 */
public class Wall {
    private String direction;
    private String color;

    public Wall(String direction, String color) {
        this.direction = direction;
        this.color = color;
    }

    public void paintWall(String color){
        System.out.println("Painting the wall " + color);
        this.color = color;
    }

    public String getDirection() {
        return direction;
    }

    public String getColor() {
        return color;
    }
}
