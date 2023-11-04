// public class J0041Thread extends Thread {
//     @Override
//     public void run(){
//         System.out.println("Hello world");
//     }
//     public static void main(String[] args) {
//         J0041Thread j0041Thread = new J0041Thread();
//         j0041Thread.start();
        
//     }
// }

public class J0041Thread implements Runnable {
    public static void main(String[] args) {
        J0041Thread j0041Thread = new J0041Thread();
        Thread thread = new Thread(j0041Thread);
        thread.start();
    }

    @Override
    public void run() {
       //throw new UnsupportedOperationException("Unimplemented method 'run'");
       System.out.println("Implementations of runnable interface");
    }
}