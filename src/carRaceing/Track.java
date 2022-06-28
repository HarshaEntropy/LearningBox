package carRaceing;

import java.util.ArrayList;

public class Track {
    int raceLength;
    ArrayList<Car> cars;
    ArrayList<Driver> drinkers;
    public Track(int raceLength){
        this.raceLength = raceLength;
        this.cars = new ArrayList<>();
        this.drinkers = new ArrayList<>();
    }

    public void addCar(Car car) {
        if (car.driver == null) return;
        this.cars.add(car);
    }

    public void startRace() {
        if(this.cars.size() == 0) {
            System.out.println("race can't be started because no cars");
            return;
        }
        boolean canRace = true;
        while(canRace) {
            for(Car car : cars){
                int randomDistance = (int) (1 + Math.random() * 10);
                car.move(randomDistance);
                System.out.println("car " + car.name+" is At " + car.x );
                if (car.x >=raceLength) {
                    canRace = false;
                    System.out.println("car " + car.name+" wins");
                    if (!canRace) break;
                }
            }
        }
    }
}

