public class RepeatingcharCompression {

    public static void compressionString(String str){
        StringBuilder result= new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int currcount=1;

            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
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
        String str= "aaabccdd";
        compressionString(str);
    }
    
}
