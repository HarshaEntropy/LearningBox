import java.util.ArrayList;
import java.util.Random;

public class Cars {
    int postion;
    int carNum;
    int rateOfChange;
    int noOfDriverss;
    Random random = new Random();
    ArrayList<Driver> driver = new ArrayList<>();

    public Cars(int carNum , int rateOfChange){
        this.carNum = carNum;
        this.rateOfChange = rateOfChange;
        this.postion = random.nextInt(10);
        this.noOfDriverss = 4;

    }
    public Cars(int niui){
        this.noOfDriverss = niui;

    }
    public void addDriver(Driver driver){this.driver.add(driver);}

    public int getNoOfDriverss() {
        return this.noOfDriverss;
    }

    public void race(int length){
        int count=0;
        while (postion < length){
            postion=postion+rateOfChange;
            count++;

        }            System.out.println("car with rate of change :" + carNum + " won " + postion + ":" + count);

    }


}
class Driver{
    String name;
    int age;
    int yearOfBron;
    public Driver(String name,int age, int yearOfBron){
        this.name=name;
        this.age=age;
        this.yearOfBron=yearOfBron;
    }
}