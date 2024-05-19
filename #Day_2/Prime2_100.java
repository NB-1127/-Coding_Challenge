public class Prime2_100 {
    
    // Write a program to calculate prime number is between is 2 to 100
    public static void main(String[] args) {
        int count,n;
        
        for (int i =2; i <=100; i++) {
            count=0;
            n=i;
            for (int j =1; j <=n; j++) {
                if (n % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("prime number is:"+ i);
            }
        }
    }
}
