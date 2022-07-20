package collections;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){

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

    }
}