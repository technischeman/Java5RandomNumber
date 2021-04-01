import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write a random number between 1-100;");
        int random = input.nextInt();
        Random random100 = new Random();
        IntStream intStream1 = random100.ints(1, 100);
        OptionalInt machineNumber = intStream1.findAny();
        System.out.println("Machine random number is= " + machineNumber);
        if (random == machineNumber.getAsInt()) {
            System.out.println("it is right");
        } else System.out.println("wrong number please try again");

    }
}
