public class FindPermutationB {

    //Time complexity is O(n * n!)
    public static void findPermutation(String str, String ans){
        //Base Case
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char curr= str.charAt(i);
            // abcde => "ab" + "de"= abde
            String Newstr= str.substring(0, i) + str.substring(i+1); 
            // here first substring goes to the 0 to i-1 and not print current i value
            // and second substring goes to the i+1 to the end 
            // if we take ex like abcde we want to skip the  c then we use that
            findPermutation(Newstr, ans+curr);
            
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPermutation(str, "");
    }
    
}
