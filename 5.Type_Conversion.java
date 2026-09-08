public class Type_Conversion{
    public static void main(String[] args){
        byte b=127;
        int a=b;
        System.out.println(b);
        System.out.println(a);

        byte b1=125;
        int a1=b1;
        System.out.println(b1);
        System.out.println(a1);

        int a2=257;
        byte k=(byte)a2;
        System.out.println(k);

        float f=5.6f;
        int t=(int)f;
        System.out.println(t);

        int a3=2567;
        byte b2=(byte)a3;
        System.out.println(b2);

        byte a4=10;
        byte b4=20;
        int m=a4*b4;
        System.out.println(m);
    }
}