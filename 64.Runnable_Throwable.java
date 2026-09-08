//Runnable interface is a functional interface that has only one abstract method run(). It is used to create a thread by implementing the Runnable interface and overriding the run() method. The run() method contains the code that will be executed by the thread. The Runnable interface can be implemented by a class or can be used with lambda expressions.
//Throwable is the superclass of all errors and exceptions in Java. It has two main subclasses: Error and Exception. The Error class represents serious problems that a reasonable application should not try to catch, while the Exception class represents conditions that a reasonable application might want to catch. The Throwable class has several methods, including getMessage(), printStackTrace(), and toString(), which can be used to get information about the throwable object.
//class A implements Runnable{
//    public void run(){
//        for(int i=0;i<5;i++){
//            System.out.println("Thread A: "+i);
//            try{
//                Thread.sleep(1000);
//            }
//            catch(InterruptedException e){
//                System.out.println("Thread A interrupted");
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//class B implements Runnable{
//    public void run(){
//        for(int i=0;i<5;i++){
//            System.out.println("Thread B: "+i);
//            try{
//                Thread.sleep(1000);
//            }
//            catch(InterruptedException e){
//                System.out.println("Thread B interrupted");
//                e.printStackTrace();
//            }
//        }
//    }
//}
public class Runnable_Throwable {
    public static void main(String[] args){
//        Runnable obj1=new A();
//        Runnable obj2=new B();
//        Runnable obj1=new Runnable(){
//            public void run(){
//                for(int i=0;i<5;i++){
//                    System.out.println("Thread A: "+i);
//                    try{
//                        Thread.sleep(1000);
//                    }
//                    catch(InterruptedException e){
//                        System.out.println("Thread A interrupted");
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };
        Runnable obj1=()->{
            for(int i=0;i<5;i++){
                System.out.println("Thread A: "+i);
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    System.out.println("Thread A interrupted");
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2=()->{
            for(int i=1;i<5;i++){
                System.out.println("Thread B: "+i);
                try{
                    Thread.sleep(100);
                } catch(InterruptedException e){
                    System.out.println("Thread B interrupted");
                    e.printStackTrace();
                }
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}