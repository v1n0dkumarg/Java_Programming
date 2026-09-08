enum Status{
    Running, Stopped, Waiting, Completed;
}

public class Enum_Loops {
    public static void main(String[] args){
        Status s= Status.Waiting;
        switch(s){
            case Running:
                System.out.println("Status is Running");
                break;
            case Stopped:
                System.out.println("Status is Stopped");
                break;
            case Waiting:
                System.out.println("Status is Waiting");
                break;
            case Completed:
                System.out.println("Status is Completed");
                break;
            default:
                System.out.println("Invalid Status");
        }
        if(s==Status.Running)
            System.out.println("Status is Running");
        else if(s==Status.Stopped)
            System.out.println("Status is Stopped");
        else if(s==Status.Waiting)
            System.out.println("Status is Waiting");
        else if(s==Status.Completed)
            System.out.println("Status is Completed");
        else
            System.out.println("Invalid Status");
    }
}