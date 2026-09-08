class StringBuffer_StringBuilder{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);


        StringBuffer sbf=new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf);
    }
}