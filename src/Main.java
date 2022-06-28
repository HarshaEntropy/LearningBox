import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sand =input.nextLine();
        String cmd[] =sand.split(" ");
        System.out.println("first "+cmd[0]);
        String krishana =cmd[1];
        System.out.println("Second "+krishana);
        System.out.println("Happy birthday Day" +
                "love you my dear!");
        System.out.println("Hello world!");
    }
}