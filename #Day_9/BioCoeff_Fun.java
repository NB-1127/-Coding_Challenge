public class BioCoeff_Fun {

    //Bonomial Coefficient formula is n!/ r!(n-r)!
    //Factorial formula is= n! * (n-1)! * (n-2)!.....1

    public static int factorialFun(int n){
        int fact=1;
        for (int i =1; i<=n; i++) {

            fact= fact * i; 
        }
        return fact;
    }

    public static int bioCoeff(int n, int r){

        int fact_n= factorialFun(n);
        int fact_r= factorialFun(r);
        int fact_nmr= factorialFun(n-r);

        int bioC= fact_n /(fact_r * fact_nmr);

        return bioC;
    }
    public static void main(String[] args) {

        System.out.println(factorialFun(4));
        System.out.println(bioCoeff(5, 2));
        
    }
    
}