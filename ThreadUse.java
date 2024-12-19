

public class ThreadUse {
    public static class A extends Thread {
        public void run() {
            System.out.println("thread A start");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static class B extends Thread {
        public void run() {
            System.out.println("thread B start");
        }
    }

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        try{
            obj1.start();
            obj2.start();

        } catch (Exception e) {
            System.out.println("something went wrong");

        }finally {
            System.out.println("program finished");
        }
    }

}
