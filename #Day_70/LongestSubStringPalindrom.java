// Longest substring pallandrome in a string
public class LongestSubStringPalindrom {

    public static boolean isPalindrom(String s){

        int left=0;
        int right=s.length()-1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static String findLogestSubstring(String s){

        if (s == null && s.length() < 1) {
            return "";
        }
        String logest=""; // some time it not work to use lonhest=s.subString(0 , 1);

        for (int i = 0; i < s.length(); i++) {

            for (int j = i+1; j < s.length(); j++) {
                
                String suString=s.substring(i, j);

                if (isPalindrom(suString) && suString.length() > logest.length()) {
                    logest = suString;
                }
            }   
        }
      
        return logest;
    }
    

    public static void main(String[] args) {

        

        String s= "babad";
        findLogestSubstring(s);

        System.out.println(findLogestSubstring(s));
        
    }
}
