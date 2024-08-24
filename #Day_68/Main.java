import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice:\n1.Exhibition event\n2.Stage event");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        try {
            if (choice == 1) {
                System.out.println("Enter the details of exhibition:");
                String details = scanner.nextLine();
                String[] data = details.split(",");

                if (data.length != 6) {
                    throw new IllegalArgumentException("Invalid input format for Exhibition event");
                }

                Exhibition exhibition = new Exhibition(
                        data[0], data[1], data[2], data[3], Double.parseDouble(data[4]), Integer.parseInt(data[5])
                );

                System.out.println("Enter the starting date of the event:");
                String startDate = scanner.nextLine();

                System.out.println("Enter the ending date of the event:");
                String endDate = scanner.nextLine();

                long totalDays = exhibition.calculateTotalDays(startDate, endDate);
                double gst = exhibition.calculateGST(totalDays);
                System.out.printf("The GST to be paid is Rs.%.1f%n", gst);

            } else if (choice == 2) {
                System.out.println("Enter the details of stage event:");
                String details = scanner.nextLine();
                String[] data = details.split(",");

                if (data.length != 6) {
                    throw new IllegalArgumentException("Invalid input format for Stage event");
                }

                StageEvent stageEvent = new StageEvent(
                        data[0], data[1], data[2], data[3], Double.parseDouble(data[4]), Integer.parseInt(data[5])
                );

                System.out.println("Enter the starting date of the event:");
                String startDate = scanner.nextLine();

                System.out.println("Enter the ending date of the event:");
                String endDate = scanner.nextLine();

                long totalDays = stageEvent.calculateTotalDays(startDate, endDate);
                double gst = stageEvent.calculateGST(totalDays);
                System.out.printf("The GST to be paid is Rs.%.1f%n", gst);
            } else {
                System.out.println("Invalid choice!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}