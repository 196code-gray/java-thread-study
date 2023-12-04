package 첫날;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are now in thread " + Thread.currentThread().getName());
            }
        });
        System.out.println(Thread.currentThread().getName() + " before thread");
        thread.start();
        System.out.println(Thread.currentThread().getName() + " after thread");
    }
}
