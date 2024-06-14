public class CompressionString {


    public static String compress(String str){
        String newStr= "";

        for (int i = 0; i < str.length(); i++) {

            Integer count= 1;
            while (i< str.length()-1 && str.charAt(i) == str.charAt(i+1)) { // here we capair the chracter to next adjecent character
                count++; // increases count is the character is same as previous

                i++;// also increses index
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(compress(str));
    }
    
}
