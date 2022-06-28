package Collection;
public class Main {

    public static void main (String[] args) {
        Theatre theatre = new Theatre("Rama talkies",12,28);
        theatre.getSeats();
        if(theatre.reseveSeat("A01")){
            System.out.println("please pay");
        }
        else {
            System.out.println("sorry seat is taken");
        }
        if(theatre.reseveSeat("A02")){
            System.out.println("please pay");
        }
        else {
            System.out.println("sorry seat is taken");
        }
    }
}