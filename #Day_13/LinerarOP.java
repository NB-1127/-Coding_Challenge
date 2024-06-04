public class LinerarOP {


     //Linear Search Time Complexity:= O(n)
    public static int findNum(int numbers[] ,int key){

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]== key) {
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int numbers[]={10,4,5,6,20,34,50,23};
        int key=23;

        int index=findNum(numbers, key);
        if (index== -1) {
            System.out.println("Not Found");
        }else{
            System.out.println("Fond index:"+index);
        }
    }
}
