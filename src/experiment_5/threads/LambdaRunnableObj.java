// Thread 3

package threads;
// code can be reduced
// as in previous methods we have class which func is only one
//  so we can use lambda class
public class LambdaRunnableObj {

    public static void main(String[] args) {
        // TODO code application logic here
/*
        
        Runnable obj1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        };
        Runnable obj2 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        };

         */
        Runnable obj1 = ()
                -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(
                ()-> {
                    for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {}
                }
            }
        );

        t1.start();
        t2.start();
    }

}
