package com.vedamsh;
/* In this class i am implementing a vehicle class
* This is to learn about hot to call a class in main and creating a object */
public class Vehicle {

    int passengers;
    int fuel_capacity;
    int mileage;

static void specifications(int len, int hei ,int wid){
    System.out.println("Vehicle Dimensions(in mm)");
    System.out.println("Length : " + len + "height : " + hei + "width : " + wid );

}

public int fuel_needed(int distance){

    int fuel = distance/mileage;
    return fuel;
}

}
