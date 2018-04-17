package SleepAndWait;

//difference between Thread.sleep() and Object.wait()
public class SleepAndWaitDemo {
    /**
     * 线程锁
     */
     private final Object object = new Object();

    /**
     * 启动线程
     */
    public void startThread() {
        Thread t = new Thread(() -> {
            {
                System.out.println("开始执行线程。。。");
                System.out.println("进入等待状态。。。");
                synchronized (object) {
                    try {
                        //调用wait()方法，线程会放弃对象锁，进入等待此对象的等待锁定池
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("线程结束。。。");
            }
        });
        t.start();
    }

    public void startThread2() {
        Thread t = new Thread(() ->{
            {
                System.out.println("开始执行线程。。。");
                System.out.println("进入睡眠状态。。。");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程结束。。。");
            }
        });
        t.start();
    }

    public void startWakenThread() {
        Thread t = new Thread(() -> {
            {
                synchronized (object) {
                    System.out.println("唤醒线程开始执行...");
                    object.notify();
                }
            }
        });
        t.start();
    }

    public static void main(String[] args) {
        SleepAndWaitDemo main = new SleepAndWaitDemo();
        main.startThread();
        main.startThread2();
        main.startWakenThread();
    }
}
