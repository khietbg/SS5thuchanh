package thuchanh1;

public class Student {
    private int age;
    private String name;
    private static String conllge="TT";

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    static void change(){
        conllge = "BCVN";
    }
    void display(){
        System.out.println(age + " "+ name +" "+conllge );
    }
}
