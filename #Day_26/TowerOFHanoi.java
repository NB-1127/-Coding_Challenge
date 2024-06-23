public class TowerOFHanoi {

    static int total=3;
    public static void toh(char src, char disc, char aux, int n){
        if (n == 0) { // Base case
            return;
        }
        toh(src, aux, disc, n-1);// 1 st faith (choti disc source --> extra tower)

        System.out.println(total -n+1 + ", disc move from " + src + " tower to " + disc+ " tower");

        toh(aux, disc, src, n-1);// 2 nd faith(choti disc extra --> destination tower)

    }
    public static void main(String[] args) {
     toh('A', 'C', 'B', 3);   
    }
}