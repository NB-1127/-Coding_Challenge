public class StringRecursion {

    // In substring we can remove only first and last element
    public static void stringSub(String str, int s , int e){

        if ( e< 0) {
            return;
        }
        stringSub(str, s, e);

       
    }

    
    public static void main(String[] args) {
        String str="abcd";
        
        stringSub(str, 0, 3);
    
    }
}
