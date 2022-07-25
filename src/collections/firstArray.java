package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class firstArray {

    public String[] array1;
    public ArrayList<String> models = new ArrayList<>();

    public ArrayList<String> insert() {

        models.add("BMW");
        models.add("VW");
        models.add("Merc");
        models.add("Lamborghini");
        models.add("Ferrari");
        models.add("Audi");
        Collections.sort(models);


        for (String i : models) {
            System.out.println(i);
        }
        return models;

    }

    public void sublist2() {
// cloning the array list
        ArrayList<String> models2 = (ArrayList<String>) models.clone();
        System.out.println("Cloned Models: " + models2);

        // creating a sublist
        ArrayList<String> models_sub = new ArrayList<>(models.subList(1, 5));
        System.out.println("Models Sublist: " + models_sub);

        for (String k : models_sub) {
            System.out.println(k);
        }

        Iterator k1;
        k1 = models_sub.iterator();
        while (k1.hasNext()) {
            System.out.println("with the iterator function :" + k1.next());
        }
    }

    public ArrayList<String> getModels() {
        return models;
    }

    //The Setter and Getter Functions are used to access the Array list in other classes.
    public void setModels(ArrayList<String> models) {
        this.models = models;
    }
}
