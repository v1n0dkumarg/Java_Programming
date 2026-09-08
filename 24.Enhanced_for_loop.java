class Students{
    int rollno;
    String name;
    int marks;
}
public class Enhanced_for_loop{
    public static void main(String[] args){
        Students s1=new Students();
        s1.rollno=1;
        s1.name="John";
        s1.marks=90;

        Students s2=new Students();
        s2.rollno=2;
        s2.name="Alice";
        s2.marks=85;

        Students student[]=new Students[2];
        student[0]=s1;
        student[1]=s2;

        for(Students stud:student){
            System.out.println(stud.rollno+" "+stud.name+" "+stud.marks);
        }

    }
}