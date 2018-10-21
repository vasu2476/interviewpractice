import java.util.concurrent.atomic.AtomicInteger;

public class OddEvenThread implements Runnable {

    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private int input;

    OddEvenThread(int input) {
        this.input = input;
    }

    public void print(String threadType) {
        System.out.println(threadType + " = " + atomicInteger.getAndIncrement());
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    @Override
    public void run() {
        while (getAtomicInteger().get() < input)
            try {
                synchronized (this) {
                    if (atomicInteger.get() % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                        print(Thread.currentThread().getName());
                    } else if (atomicInteger.get() % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                        print(Thread.currentThread().getName());
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public static void main(String args[]) {
        final int input = 10;
        OddEvenThread threadExample = new OddEvenThread(input);

        Thread odd = new Thread(threadExample);
        odd.setName("odd");
        odd.start();
       Thread even = new Thread(threadExample);
       even.setName("even");
        even.start();
    }
}

