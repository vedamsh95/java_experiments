package arrays;

import com.vedamsh.*;

import java.util.ArrayList;
import java.util.Collections;

public class firstArray {

    public String[] array1;
    public String[] models;

    public void insert() {

        ArrayList<String> models = new ArrayList<>();
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


    }


}
