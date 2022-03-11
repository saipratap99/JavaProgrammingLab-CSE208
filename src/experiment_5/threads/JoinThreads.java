/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author DELL
 */
public class JoinThreads {
    public static void main(String[] args) throws Exception
    { 
        Thread t1 = new Thread(()->{
           for(int i=0;i<10;i++)
           {
               System.out.println("Hi");
               try{
                   Thread.sleep(5000);
               }
               catch(Exception e){ }
           }
        },"Hi Thread");
         Thread t2 = new Thread(()->{
           for(int i=0;i<10;i++)
           {
               System.out.println("Hello");
               try{
                   Thread.sleep(5000);
               }
               catch(Exception e){ }
           }
        },"Hello Thread");
        
         System.out.println(t1.getName());
         System.out.println(t2.getName());
         t1.setPriority(Thread.MAX_PRIORITY);
         t2.setPriority(1);
         t1.start();
         t2.start();
         
         t1.join();
         t2.join();
         
         System.out.println("Bye!");
    }
}
