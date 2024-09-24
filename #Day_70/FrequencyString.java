public class FrequencyString {


    public static void main(String[] args) {
        
        String str= "raram";

        int freq[]= new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++; // update the frequency array
            }

        }
        System.out.println("Character Frequency:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) { // if we want all the charcter frq count

                //if(freq[i] > 0)
                System.out.print((char) (i + 'a') + "" + freq[i]);
            }
        }
    }
    
}
