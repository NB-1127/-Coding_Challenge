public class BinaryArrayCount1 {
// que was to find the max count of the consecutive 1's in a given binary array
    public static void main(String[] args) {
        
        int arr[]={1,1,1,0,1};

        int cutrrcount=0;
        int maxcount=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cutrrcount++;
                if (cutrrcount > maxcount) {
                    maxcount=cutrrcount;
                }
                
            }else{

                cutrrcount=0;
            }
            
        }
        System.err.println(maxcount);
    }
    
}
