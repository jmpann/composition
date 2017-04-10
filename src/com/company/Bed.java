package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by flatironschool on 4/10/17.
 */
public class Bed {
    private String size;
    private int pillows;
    private int height;
    private int sheets;
    private int comforter;

    public Bed(String size, int pillows, int height, int sheets, int comforter) {
        this.size = size;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.comforter = comforter;
    }

    public void make(){
        System.out.println("Bed is made. Jump right in");
    }

    public String getSize() {
        return size;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getComforter() {
        return comforter;
    }
}
