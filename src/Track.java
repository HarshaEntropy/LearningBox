import java.util.ArrayList;

public class Track {
    int length;
    ArrayList<Cars> cars = new ArrayList<>();

    public Track(int length) {
        this.length = length;
    }

    public void addCar(Cars car) {
        this.cars.add(car);
    }

    public void start( int length) {

            for (Cars car : this.cars) {
                if (car.getNoOfDriverss() == cars.size()) {
                    car.race(length);
            }
            else System.out.println("car != drivers" + car.getNoOfDriverss());
            //}
            //  else System.out.println("Number of drivers are not equal to number of cars");
        }
    }
}
