class A extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Thread A: "+i);
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Thread B: "+i);
        }
    }
}
public class Multi_Thread {
    public static void main(String[] args){
        A obj1=new A();
        B obj2=new B();
        obj1.start();
        obj2.start();
    }
}