package threads;

/**
 *
 * @author DELL
 */
class Counter{
    int count = 0;
    // using syn.. will make this method avaliable for one thread at a time
    public synchronized void increment(){
        count ++;
    }
}
public class Synchronization {
    public static void main(String[] args) throws Exception
    {
        Counter c =  new Counter();
        Thread t1 = new Thread(()->{
           for(int i=0;i<10000;i++)
               c.increment();
        });
        Thread t2 = new Thread(()->{
           for(int i=0;i<10000;i++)
               c.increment();
        });
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count - " + c.count);
    }
}
