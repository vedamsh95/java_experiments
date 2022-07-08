package com.vedamsh;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("test");
Method.name("vedamsh");
Method.name("vanja");

int van_range,jeep_range,van_fuelneeded,jeep_fuelneeded;
Vehicle van= new Vehicle();
Vehicle jeep = new Vehicle();

int distance=2400;
        //inputs for van
        van.passengers=5;
        van.fuel_capacity=20;
        van.mileage=13;

       van_fuelneeded= van.fuel_needed(distance);

        // inputs for jeep
        jeep.passengers=4;
        jeep.fuel_capacity=12;
        jeep.mileage=15;

        jeep_fuelneeded=jeep.fuel_needed(distance);

        //calculating the ranges
          van_range= van.fuel_capacity*van.mileage;
          jeep_range= jeep.fuel_capacity*jeep.mileage;

          System.out.println("Van can carry " + van.passengers + " people." + "With a range of " + van_range + " kilometers.");
        van.specifications(2000,800,750);
          System.out.println("to travel " + distance + " kms. " + "van need "+ van_fuelneeded + " liters of fuel." );
          System.out.println("Jeep can carry " + jeep.passengers + " people." + "With a range of " + jeep_range + " kilometers.");
        jeep.specifications(2500,900,980);
          System.out.println("to travel " + distance + " kms. " + "jeep need "+ jeep_fuelneeded + " liters of fuel." );




    }
}
