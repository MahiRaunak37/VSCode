public class J0042ThreadPriority implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + i);
        }
    }

    public static void main(String[] args) {
        J0042ThreadPriority priority = new J0042ThreadPriority();
        Thread thread1 = new Thread(priority);
        Thread thread2 = new Thread(priority);
        thread1.start();
        thread2.start();

    }

}