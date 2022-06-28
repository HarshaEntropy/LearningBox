package carRaceing;
public class Main {
    public static void main(String[] args) {
        Track track =new Track(14200);
        Car carA = new Car("KIA");
        Car carB = new Car("BMW");
        Car carC = new Car("Swift");
        carA.setDriver(new Driver("Shanker"));
        carB.setDriver(new Driver("Nike"));
        carC.setDriver(new Driver("Yogi"));
        track.addCar(carA);
        track.addCar(carB);
        //track.addCar(carC);
        track.startRace();
    }
}
