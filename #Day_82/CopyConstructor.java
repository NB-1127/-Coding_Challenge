public class CopyConstructor {

    public static void main(String[] args) {
        Student s1= new Student("neha", 11);
        
        
        Student s2= new Student(s1);
        System.out.println(s2.name + " " + s2.roll);
    }
    
}
class Student{

    String name;
    int roll;

    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }
    Student(){
        System.out.println("Default constructor");
    }

    Student(String name, int roll){
        this.name= name;
        this.roll=roll;
    }
}
