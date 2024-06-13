public class Stringequal {
    
    public static void main(String[] args) {
        String str="hello";
        String s= "hello";// there is reference variable are pointing the same instance

        String s1= new String(); // new is allocate separate memory allocation
        String s2= new String();

        if (s1 == s2) {
            System.out.println("String is equal ");
        }else{
            System.out.println("not equal String");// this statement is executed
        }

        if (str== s) { 
            System.out.println("Equal String");
        }else{
        System.out.println("not equal");
    }
}
}
