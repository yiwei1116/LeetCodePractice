package LeetCode;

public class Encapsulation {
    private String name;
    private int age;


    public void setAge(int age){

        this.age = age;
    }

    public int getAge(){

            return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
