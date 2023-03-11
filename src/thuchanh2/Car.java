package thuchanh2;

public class Car {
    private String name;
    private String engine;
    private int numberOfCar;

    public Car(String name, String engine, int numberOfCar) {
        this.name = name;
        this.engine = engine;
        this.numberOfCar = numberOfCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(int numberOfCar) {
        this.numberOfCar = numberOfCar;
    }
}
