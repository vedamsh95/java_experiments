package collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        firstArray cars=new firstArray();
 cars.insert();
 cars.sublist2();
 cars.getModels();

 sublist list = new sublist();
 list.sublist();

 testLinked fruits = new testLinked();
 fruits.insertLL();

        ArrayList<Student> studentArrayList=new ArrayList<>();

        studentArrayList.add(new Student(101,"ram","mohan"));
        studentArrayList.add(new Student(101,"vijay","mohan"));
        studentArrayList.add(new Student(102,"krishna","ram"));
        studentArrayList.add(new Student(103,"vamshi","reddy"));
        studentArrayList.add(new Student(103,"ali","mohd"));
        studentArrayList.add(new Student(105,"ram","reddy"));

        studentArrayList.stream().distinct().forEach(student -> {
            System.out.println("Roll Number : "+student.getRollnum()+" First Name : "+student.getFirstName()+" Last Name : "+student.getLastName());
        });

        Parentclass test1 = new Parentclass();
        test1.addition(5,4,6);

        childclass test2 = new childclass();
        test2.addition(5,4,8);

        System.out.println("Hashmap Implementations");

        Hashmaptest hmap= new Hashmaptest();
        hmap.Hashmap1();
        hmap.Hashmap2();

       FileHand filee =new FileHand();
        filee.filehandler();
        File_Write filew = new File_Write();
        filew.write_file();
    }
}