import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<Integer> allNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            allNumbers.add(ThreadLocalRandom.current().nextInt(0, 100));
        }
        A a = new A();
        System.out.println(a.sort(allNumbers, 1));
    }
}
