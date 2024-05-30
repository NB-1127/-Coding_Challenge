public class Swap_fun {

    //Write a progrm to Swap a number
    public static void Swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("A is :"+a);
        System.out.println("B is :" +b);
        
        
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        Swap(a, b);
       
        

    }
    
}
