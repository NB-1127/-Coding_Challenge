// reverse whole string not a single word of a string like “I.like” = “like.i”
public class ReverseString {


    public static void main(String[] args) {

        String str= "like.I";

        String word[]=str.split("\\.");

        StringBuilder reverseStr= new StringBuilder();

        for (int i = word.length-1; i >=0; i--) {
            reverseStr.append(word[i]);

            if (i != 0) {
                reverseStr.append(".");
            }
        }

        System.out.println(reverseStr.toString());
        
        
    }
    
}
