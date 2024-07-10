public class FindSubSetB {

    //Time complexity is: O(n* 2^n)
    public static void findSubString(String str, String ans, int i){
        //Base Case
        if (i == str.length()) {

            if (ans.length() == 0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // Yes Choice
        findSubString(str, ans+str.charAt(i), i+1);

        // No Choice
        findSubString(str, ans, i+1);
    }
public static void main(String[] args) {
    String str= "abc";
    findSubString(str, "", 0);
}    
}