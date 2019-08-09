import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author draper_hxy
 */
public class Main {

    public static void main(String[] args) {
        case1();
    }

    public static void case1() {
        List<Main> integerList = new LinkedList<>();
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            int randomInt = new Main().test();
            integerList.add(new Main());
        }
    }

    public int test() {
        Random random = new Random();
        return random.nextInt(1000);
    }

}
