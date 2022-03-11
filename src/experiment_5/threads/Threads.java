
// Thread 1
package threads;


// Suspending thread
// As we know one method will take 5s to complete we should not let independed method to wait
// we can run that indepenedent method parllely
// By using treads

class Hi extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
}

class Hello extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
}

public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        obj1.start();
        obj2.start();
    }
    
}
