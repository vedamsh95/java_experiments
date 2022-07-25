package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmaptest {

    public void Hashmap1(){

        HashMap<Integer,String> odd= new HashMap<Integer, String>();


        odd.put(1,"one");
        odd.put(3,"Three");
        odd.put(5,"five");
        odd.put(7,"Seven");
        odd.put(9,"nine");

        System.out.println("The hash map is" + odd);
        System.out.println("THE value of key 3 is " + odd.get(3));
        System.out.println("THE value of key 5 is " + odd.get(5));
        System.out.println("THE value of key 9 is " + odd.get(9));

        //Display values using iterator


        Set set = odd.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()){
            Map.Entry Map1 = (Map.Entry)i.next();

            System.out.println(" \n The Key is : " + Map1.getKey() + " The value is : " + Map1.getValue());
        }
    }

    public void Hashmap2(){

        HashMap<String,Integer> even= new HashMap<String, Integer>();

        even.put("two",2);
        even.put("four",4);
        even.put("six", 6);
        even.put("eight",8);
        even.put("ten",10);

        //Iterating and getting the key and value.

        Set set2 = even.entrySet();
        Iterator k = set2.iterator();
        while (k.hasNext()){
            Map.Entry hmap2 = (Map.Entry)k.next();
            System.out.println("The Key is : " + hmap2.getKey() + " The value is: " + hmap2.getValue());
        }
    }
}
