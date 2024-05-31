public class Methodoverloading_fun {
    
    /*Method Overloading := class have the same name
        but diffirent parameter list
    */
    public static int Sum(int a, int b){
        return a+b;
    }
    public static float Sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {

        System.out.println(Sum(5, 4));

        System.out.println(Sum(3.4f, 5.7f));
    }
}
