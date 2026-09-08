//Multi Dimentional Array
public class MD_Array{
    public static void main(String[] args){
        int nums[][]=new int[3][4];
        for(int i=0; i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]=(int)(Math.random()*1000);
               // System.out.println(nums[i][j]);
            }
        }
//        for(int i=0; i<3;i++){
//            for(int j=0;j<4;j++){
//                System.out.println(nums[i][j]+" ");
//            }
//        }
        for(int n[]: nums){
            for(int m:n){
                System.out.println(m);
            }
        }
    }
}