class RecursionTillingPro{

    public static int tillingProblem(int n){
        //Base Case
        if (n == 0 || n== 1) {
            return 1;
        }
        //vertical possibilities
        int fnm1=tillingProblem(n-1);

        //Horizonal possible ways
        int fnm2=tillingProblem(n-2);

        //Total number of ways
        int totalfn=fnm1+fnm2;

        return totalfn;
    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
    }
}