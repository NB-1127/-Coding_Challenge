import java.util.Scanner;

public class Solution2 {

    public static int maxWords(String[] sentences) {
        int maxWords = 0;


        for (int i = 0; i < sentences.length; i++) {
            int wordCount = 0;
            String sentence = sentences[i];
            boolean inWord = false; 
      
            for (int j = 0; j < sentence.length(); j++) {
                char ch = sentence.charAt(j);
                

                if (ch == ' ') {
                    if (inWord) {
                        wordCount++; 
                        inWord = false; 
                    }
                } else {
                    inWord = true; 
                }
            }
         
            if (inWord) {
                wordCount++;
            }
            if (wordCount > maxWords) {
                maxWords = wordCount;
            }
        }

        return maxWords;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of sentences: ");
        int numberOfSentences = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] sentences = new String[numberOfSentences];
        for (int i = 0; i < numberOfSentences; i++) {
            System.out.print("Enter sentence " + (i + 1) + ": ");
            sentences[i] = scanner.nextLine();
        }

        int result = maxWords(sentences);
        System.out.println("The maximum number of words in a single sentence is: " + result);
        
        scanner.close();
    }
}