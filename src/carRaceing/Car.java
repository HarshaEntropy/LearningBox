package carRaceing;

import java.util.List;

public class Car {
    int x;
    Driver driver;
    String name;
    public Car(String name) {
        this.x = 0;
        this.name = name;
        this.driver = null;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void move(int distance){
        this.x = this.x + distance;
    }
}

