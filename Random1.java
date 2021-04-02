import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;
public class Random1 {
    public static void main(String[] args) {
        //random taking two numbers
        Random random100 = new Random();
        IntStream intStream1 = random100.ints(39, 49);
        OptionalInt RandomNumber = intStream1.findAny();
        int intValueOfNumber= RandomNumber.getAsInt();
        System.out.println(RandomNumber);
        System.out.println(intValueOfNumber);
        //random taking
        Random random=new Random();
        int ramndonnew=random.nextInt(10);
        System.out.println(ramndonnew);

    }
}
