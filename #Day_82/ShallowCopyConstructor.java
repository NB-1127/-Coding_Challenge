public class ShallowCopyConstructor {

    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Neha";
        s1.roll=11;
        s1.marks[0]= 80;
        s1.marks[1]= 99;
        s1.marks[2]= 100;

        Student s2= new Student(s1);

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]+ " ");
        }
    }
}
class Student{

    String name;
    int roll ;
    int marks[];

    //shallow copy Constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;

    }
    Student(){
        marks=new int[3];
    }
    Student(String name, int roll){
        marks=new int[3];
        this.name= name;
        this.roll=roll;
    }
}