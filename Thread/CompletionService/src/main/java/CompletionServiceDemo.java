import java.util.Random;
import java.util.concurrent.*;

/**
 * @author draper_hxy
 */
public class CompletionServiceDemo {

    public static class Task implements Callable<Integer> {
        private int i;

        Task(int i) {
            this.i = i;
        }

        @Override
        public Integer call() throws InterruptedException {
            int randomInt = new Random().nextInt(5000);
            Thread.sleep(randomInt);
            System.out.println(Thread.currentThread().getName() + "\t睡眠时间:" + randomInt + "\ti:" + i);
            return i;
        }
    }

    public void run() {
        ExecutorService es = Executors.newFixedThreadPool(10);
        CompletionService<Integer> cs = new ExecutorCompletionService<>(es);

        try {


            for (int i = 0; i < 10; i++) {
                cs.submit(new CompletionServiceDemo.Task(i));
            }

            for (int i = 0; i < 10; i++) {
                System.out.println(cs.take().get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            es.shutdown();
        }
    }

    public static void main(String[] args) {
        new CompletionServiceDemo().run();
    }
}
