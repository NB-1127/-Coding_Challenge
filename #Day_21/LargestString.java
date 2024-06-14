public class LargestString {


    /*Compairto fuction in String
     * Caompair 2 string gives int answer
     * if                      ans
     * str1 and str2 equal      0
     * str1 before sorts str2   -ve   str1 < str2 
     * str1 after sorts str2    +ve   str1 > str2
     */
    public static String findLargestString(String str[]){

        String largest =str[0]; // here we assign the first character as in largest 
        for (int i = 1; i < str.length; i++) {
         if(largest.compareTo(str[i]) < 0){ // here we compair the in first , second... character of every string of each

            largest =str[i];
         }

        }
        return largest;
    }


    public static void main(String[] args) {
        String str[]= {"apple", "mango", "banana"};

        System.out.println(findLargestString(str));
    }
    
}
