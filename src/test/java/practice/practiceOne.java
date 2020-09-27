package practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class practiceOne {
    interface Cab{
        void bookCab(String destination);
    }
    public static void main(String[] args) {
        Cab cab = (destination) -> System.out.println("Hello World " + destination);
        cab.bookCab("Miami");
    }

    @Test
    public void lambda(){
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        arrL.forEach(n -> System.out.println(n));
        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); });

        for (int i=1; i<5; i++){
            System.out.println("hello");
        }

        IntStream.range(1, 5).mapToObj(i -> "hello").forEach(System.out::println);
    }

}
