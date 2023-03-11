package thuchanh1;

public class Main {
    public static void main(String[] args) {
    Student.change();
    Student st1 = new Student(20,"nam");
        Student st2 = new Student(21,"khiet");
        Student st3 = new Student(22,"khoa");
        st1.display();
        st2.display();
        st3.display();
    }
}
