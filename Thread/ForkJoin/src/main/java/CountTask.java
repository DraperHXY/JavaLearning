import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * RecursiveAction 用于无返回结果的任务
 * RecursiveTask 用于有返回结果的任务
 *
 * @author draper_hxy
 */
public class CountTask extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 200;
    private int start;
    private int end;

    public CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;

        // 如果任务足够小，那么久进行计算
        boolean canCompute = (end - start) <= THRESHOLD;

        if (canCompute) {
            for (int i = start; i <= end; i++) {
                System.out.println((sum + i) + "=" + sum + "+" + i);
                sum += i;
            }
        } else {
            // 任务不够小，继续划分两个子任务
            int middle = (start + end) / 2;
            CountTask leftTask = new CountTask(start, middle);
            CountTask rightTask = new CountTask(middle + 1, end);

            leftTask.fork();
            rightTask.fork();

            System.out.println(sum + "=" + leftTask.join() + "+" + rightTask.join());
            sum = leftTask.join() + rightTask.join();

        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        CountTask task = new CountTask(1, 100);
        Integer result = forkJoinPool.invoke(task);
        System.out.println(result);
    }

}
