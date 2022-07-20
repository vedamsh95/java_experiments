package collections;

public class Student {

    int rollnum;
    String firstName,lastName;

    public Student(int rollnum,String firstName,String lastName){

         this.rollnum=rollnum;
         this.firstName=firstName;
         this.lastName=lastName;

    }

    public int getRollnum() {
        return rollnum;
    }

    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj)
    {
        return this.rollnum == ((Student)obj).getRollnum();
    }
    @Override
    public int hashCode()
    {
        return this.rollnum;
    }
}
