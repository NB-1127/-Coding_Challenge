import java.util.Arrays;

public class RemoveDuplicateString {

    public static String removeDublicate(String str){

        StringBuilder result= new StringBuilder();
        boolean[] seen=new boolean[26];


        for(char ch : str.toCharArray()){
            int index= ch -'a';

            if (!seen[index]) {
                result.append(ch);
                seen[index]= true;

               
            }
    
        }
        char[] sortresult=result.toString().toCharArray();
            Arrays.sort(sortresult);
            return new String(sortresult);
       
        
    }


    public static void main(String[] args) {
        String str= "cbacdcbc";

        System.out.println(removeDublicate(str));
    }
    
}
