package com.company;

public class Main {

    public static void main(String[] args) {

//	Case theCase = new Case("220B", "Dell", "480", new Dimensions(20,20,5));
//	Monitor Monitor = new Monitor("27inch", "Acer", 27, new Resolution(2540, 1440));
//	Motherboard Motherboard = new Motherboard("BJ-200", "Asus", 4,6, "v2.44");
//
//	//uses getter methods to call the method associated with each object in each field of PC
//	PC thePC = new PC (theCase, Monitor, Motherboard);
//	thePC.powerUp();

	Wall wall1 = new Wall("West", "blue");
	Wall wall2 = new Wall("North", "blue");
	Wall wall3 = new Wall("East", "blue");
	Wall wall4 = new Wall("South", "blue");

	Ceiling ceiling = new Ceiling(12, "white");

	Bed bed = new Bed("queen", 4, 3, 2, 1);

	Alarm alarm = new Alarm("Alexa", false, 8);

	Bedroom bedroom = new Bedroom("josh's room", wall1, wall2, wall3, wall4, ceiling, bed, alarm);
	System.out.println(bedroom);

	bedroom.getAlarm().setActive("7:00am");
	bedroom.getAlarm().wakeUp();
	bedroom.getAlarm().turnOff();
	wall1.paintWall("pink");
    }



}
