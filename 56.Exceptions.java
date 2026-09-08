public class Exceptions{
    public static void main(String[] args){
        int i=0;
        int j=0;
        try{
            j=10/i;
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
        System.out.println("j= "+j);
    }
}