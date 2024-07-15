import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Choose Stall Type");
            System.out.println("1) Gold Stall");
            System.out.println("2) Premium Stall");
            System.out.println("3) Executive Stall");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            Stall stall = null;

            switch (choice) {
                case 1:
                    System.out.println("Enter Stall details in comma separated (Stall Name, Stall Cost, Owner Name, Number of TV sets)");
                    String[] goldDetails = scanner.nextLine().split(",");
                    if (goldDetails.length == 4) {
                        stall = new GoldStall(goldDetails[0].trim(), Integer.parseInt(goldDetails[1].trim()), goldDetails[2].trim(), Integer.parseInt(goldDetails[3].trim()));
                    } else {
                        System.out.println("Invalid input format for Gold Stall");
                    }
                    break;
                case 2:
                    System.out.println("Enter Stall details in comma separated (Stall Name, Stall Cost, Owner Name, Number of Projectors)");
                    String[] premiumDetails = scanner.nextLine().split(",");
                    if (premiumDetails.length == 4) {
                        stall = new PremiumStall(premiumDetails[0].trim(), Integer.parseInt(premiumDetails[1].trim()), premiumDetails[2].trim(), Integer.parseInt(premiumDetails[3].trim()));
                    } else {
                        System.out.println("Invalid input format for Premium Stall");
                    }
                    break;
                case 3:
                    System.out.println("Enter Stall details in comma separated (Stall Name, Stall Cost, Owner Name, Number of Screens)");
                    String[] executiveDetails = scanner.nextLine().split(",");
                    if (executiveDetails.length == 4) {
                        stall = new ExecutiveStall(executiveDetails[0].trim(), Integer.parseInt(executiveDetails[1].trim()), executiveDetails[2].trim(), Integer.parseInt(executiveDetails[3].trim()));
                    } else {
                        System.out.println("Invalid input format for Executive Stall");
                    }
                    break;
                default:
                    System.out.println("Invalid Stall Type");
            }

            if (stall != null) {
                stall.display();
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter the details correctly.");
        } finally {
            scanner.close();
        }
    }
}