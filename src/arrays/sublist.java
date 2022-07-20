package arrays;

import java.util.ArrayList;

public class sublist {


    public void sublist(){
        firstArray cars= new firstArray(); // CALLING THE OBJECT
        cars.insert(); // YPU HAVE TO CALL THE METHOD
        System.out.println("Sublist implementation" );


        ArrayList<String> checking =cars.getModels(); // USE THE GETTER FUNCTION TO GET THE ARRAY LIST

        System.out.println(checking);
        ArrayList<String> list1 = new ArrayList<>(checking.subList(1,4));
        System.out.println("The sublist is: " + list1);
        }

    }

