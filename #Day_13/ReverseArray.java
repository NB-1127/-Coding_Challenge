public class ReverseArray {

    //time Complexity := O(n)
    //Space Complexity:- O(1)
    public static void reverseArray(int numbers[]){
        int first=0;
        int last= numbers.length-1;

        while (first < last) {
            //swap
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {


        int numbers[]={2,4,6,8,10};

        reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }

    }
    
}
