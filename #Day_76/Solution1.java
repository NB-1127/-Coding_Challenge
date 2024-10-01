import java.util.Scanner;

public class Solution1 {

   
    public static String findSourceCity(String[][] paths) {
        for (int i = 0; i < paths.length; i++) {
            String cityA = paths[i][0];
            boolean isSourceCity = true;

           
            for (int j = 0; j < paths.length; j++) {
                if (paths[j][1].equals(cityA)) {
                    isSourceCity = false;
                    break;
                }
            }

            if (isSourceCity) {
                return cityA; 
            }
        }

        return ""; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of paths: ");
        int numPaths = scanner.nextInt();
        scanner.nextLine(); 
        
        String[][] paths = new String[numPaths][2];

        
        for (int i = 0; i < numPaths; i++) {
            System.out.print("Enter path " + (i + 1) + " (cityA cityB): ");
            String input = scanner.nextLine();

            
            StringBuilder cityA = new StringBuilder();
            StringBuilder cityB = new StringBuilder();
            boolean foundSpace = false;

            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);

                if (ch == ' ') {
                    foundSpace = true; 
                } else {
                    if (!foundSpace) {
                        cityA.append(ch); 
                    } else {
                        cityB.append(ch); 
                    }
                }
            }

           
            paths[i][0] = cityA.toString();
            paths[i][1] = cityB.toString();
        }

        
        String sourceCity = findSourceCity(paths);
        System.out.println("The source city is: " + sourceCity);
        
       
    }
}
