public class ShortestPath{


    public static float getShortestPath(String path){
        int x=0;
        int y=0;

        for (int i = 0; i < path.length(); i++) {
            char dir=path.charAt(i);
            //East
            if (dir == 'E') {
                x++;
            }else if(dir == 'w'){ //west
                x--;
            }else if (dir == 'N') { // south
                y++;
            }else{ // north
                y--;
            }
        }
        // displacemet calculation for the shortest path
        int x2= x*x;
        int y2= y*y;
        return (float)Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        String path= "WNEENESENNN";

        System.out.println(getShortestPath(path));
    }
}