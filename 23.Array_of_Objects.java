class Student{
    int rollno;
    String name;
    int marks;
}
public class Array_of_Objects{
    public static void main(String[] args){
        Student s1= new Student();
        s1.rollno=1;
        s1.name="John";
        s1.marks=90;

        Student s2=new Student();
        s2.rollno=2;
        s2.name="Alice";
        s2.marks=85;

        Student s3=new Student();
        s3.rollno=3;
        s3.name="Bob";
        s3.marks=95;

        Student stud[]=new Student[3];
        stud[0]=s1;
        stud[1]=s2;
        stud[2]=s3;

        for(int i=0; i<stud.length;i++){
            System.out.println("Roll No:"+ stud[i].rollno+ " Name:"+ stud[i].name+ " Marks:"+ stud[i].marks);
        }
    }
}