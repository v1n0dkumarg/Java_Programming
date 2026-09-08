public class Array{
    public static void main(String[] args){
//        int num[]={1,2,3,4,5};
//        num[1]=10;
//        System.out.println(num[1]);
        int num[]= new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;
        for(int i=0;i<num.length; i++){
            System.out.println(num[i]);
        }
    }
}