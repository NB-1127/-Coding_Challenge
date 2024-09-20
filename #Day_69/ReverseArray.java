public class ReverseArray {

    public static void reverceNo(int number[]){

        int start=0;
        int last= number.length-1;

        while (start < last) {
            
            int temp= number[last];
            number[last]=number[start];
            number[start]=temp;

            start++;
            last--;
        }
    }
    

    public static void main(String[] args) {
        int number[]={2,3,67,45,22,11};
        reverceNo(number);

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();

    }
}
