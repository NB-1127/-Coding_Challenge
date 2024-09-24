// Given a string containing only lowercase alphabets, we have to compress it by removing any consecutive repeated characters.
// replace consecutive repeating characters with the character and repetition count
// for single occurrence of a character just use the character as-is

// Examples:
// INPUT: "bbbbb"
// OUTPUT: "b5"
// INPUT: "abc"
// OUTPUT: "abc"
// INPUT: "aabbbcadd"
// OUTPUT: "a2b3cad2"
// 10min
public class ReapitingCharacter {

    public static void compresstionStr(String str){
        
        StringBuilder result=new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int currcount=1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                currcount++;
                i++;
            }
            result.append(str.charAt(i));
            if (currcount > 1) {
                result.append(currcount);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        
        String str= "aaabbccdee";
        compresstionStr(str);


    }
    
}
