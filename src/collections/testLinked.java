package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class testLinked {

    public  LinkedList<String> insertLL(){

        System.out.println("\n LinkedList Implementation");
        LinkedList<String> list1= new LinkedList<>();

        list1.add("Apple");
        list1.add("Banana");
        list1.add("mango");
        list1.add("pear");

        Collections.sort(list1);

        System.out.println("The Linked List is :" + list1);

        Iterator<String> iterator = list1.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list1.addFirst("jackfruit");
        list1.addLast("grape");
        list1.remove(2);
        list1.set(3,"orange");
        list1.add(4,"Lemon");


        System.out.println("Modified Linked List: " + list1);

        LinkedList<String> Citrus= new LinkedList<String>(list1.subList(3,5));


        System.out.println("These are citrus fruits: " + Citrus);

      /*  Citrus.addAll(1, list1);
        System.out.println("After add all with index: " + Citrus);*/

        Citrus.addAll(list1);
        System.out.println("After add all : " + Citrus);

        List<String> newList = Citrus.stream().distinct().collect(Collectors.toList());
        System.out.println("REmoveing duplicates: " + newList);


return list1;
    }
}
