public class ArrayKey {

    public static int linearSerch(int number[], int key){

        for (int i = 0; i < number.length; i++) {
            
            if (number[i]==key) {
                return i;
            }
        }
        return key;
    }

    public static void main(String[] args) {
        int number[]={23,56,78,4,3,32};
        int key=4;

       System.out.println(linearSerch(number, key));
    }
}