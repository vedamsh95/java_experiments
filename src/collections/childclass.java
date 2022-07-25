package collections;

public class childclass extends Parentclass {

    public void addition(int a,int b){
        System.out.println("This is a child class");
    }

    @Override
    public void addition(int a, int b, int c) {

        System.out.println("overriding child class");
    }
}
