public class UniqueString {

    //check whether string is unique or not.

    public static boolean isUnique(String str){
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {

                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str= "Sangita";

        if (isUnique(str)) {
            System.out.println("String have the all the character unique");
        }else{
            System.out.println("Not all character Unique");
        }
    }
    
}
