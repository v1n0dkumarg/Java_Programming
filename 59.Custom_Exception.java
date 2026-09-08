class VoterException extends Exception{
    public VoterException(String message){
        super(message);
    }
}
public class Custom_Exception {
    public static void main(String[] args){
        int age=15;
        try{
            if(age<18){
                throw new VoterException("Not eligible to vote");
            }
            }catch(VoterException e){
                System.out.println("Exception: "+e);
            }
        }
    }