package thuchanh2;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("VinFast lux a","V6",1);
        Car c2 = new Car("VinFast vf 8","V8",2);
        Car c3 = new Car("VinFast vf 9","V12",3);
        System.out.println(c1.getNumberOfCar());
        System.out.println(c2.getNumberOfCar());
        System.out.println(c3.getNumberOfCar());
    }
}
