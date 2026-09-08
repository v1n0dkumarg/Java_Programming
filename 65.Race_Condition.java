// Race condition occurs when two threads
class Counter{
    int count;
    public synchronized void increment(){//synchronized keyword is used to avoid race condition
        count++;
    }
}
public class Race_Condition {
    public static void main(String[] args) throws InterruptedException {
        Counter c=new Counter();
        Runnable obj1=()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        };
        Runnable obj2=()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start(); //t1.start() is used to start the thread t1
        t2.start(); //t2.start() is used to start the thread t2
        t1.join(); //t1.join() is used to wait for t1 to finish before proceeding
        t2.join(); //t2.join() is used to wait for t2 to finish before proceeding
        System.out.println(c.count);
    }
}