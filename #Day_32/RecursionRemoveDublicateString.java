public class RecursionRemoveDublicateString {


    public static void removeDublicate(String str, int indx, StringBuilder newstr, boolean map[]){

        //Base case
        if (indx ==str.length()) {

            System.out.println(newstr);
            return;
        }
        char curr=str.charAt(indx);
        if (map[curr- 'a']== true) {

            removeDublicate(str, indx+1, newstr, map);
        }else{
            map[curr-'a'] = true;
            removeDublicate(str, indx+1, newstr.append(curr), map);
        }

    }
    public static void main(String[] args) {
        String str= "appannacolleg";
        removeDublicate(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
}