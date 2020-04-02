package com.mycode.runnable;

/*10. Implement methods
public static void runTogether(Runnable... tasks)    The first method should run each task in a separate thread and then return.
public static void runInOrder(Runnable... tasks)     The second method should run all methods in the current thread
                                                      and return when the last one has completed. */

public class Methods {

    public static void runTogether(Runnable... tasks) {
        for (Runnable task : tasks) {
            new Thread(task).start();
        }
    }

    public static void runlnOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }

    public static void main(String[] args) {
        runlnOrder(Methods.print(), Methods.print2(), Methods.print2());
        runTogether(Methods.print(), Methods.print2(), Methods.print2(), Methods.print2());
    }

    public static Runnable print() {
        return () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.print(i + "  ");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        };
    }

    public static Runnable print2() {
        Runnable runnable = () -> {
            System.out.println("hello");
        };
        return runnable;
    }


}
