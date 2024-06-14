public class SubString {


    public static String findSubString(String str, int si, int en){
        String substring ="";
        for (int i = si; i < en; i++) {
            
            substring +=str.charAt(i);
        }
        return substring;

    }

    public static void main(String[] args) {
        String str= "HelloNeha";

        System.out.println(findSubString(str, 0, 4)); // it shpuld be return 0 to 4-1= Hell
    }
    
}
