public class Q2 {
    public static boolean inRange(int i, int j, int [][] arr){
        int n = arr.length;
        int m = arr[0].length;

        if(i < 0 || i >= n || j < 0 || j >= m)
            return false;
        return true;
    }

    public static boolean inRange(int i, int j, int n, int m){
        if(i < 0 || i >= n || j < 0 || j >= m)
            return false;
        return true;
    }


    public static int mazePath_01(int sr, int sc, int dr, int dc, int [][] dir, String [] dirN, String asf){
        if(sr == dr && sc == dc){
            System.out.println(asf);
            return 1;
        }

        int count  = 0;
        for(int d = 0; d < dir.length; d++){
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if(inRange(r,c,dr + 1, dc + 1)){
                count += mazePath_01(r,c, dr, dc, dir, dirN, asf + dirN[d]);
            }
        }
        return count;

    }

    //With Jumps: Move
    public static int mazePath_02(int sr, int sc, int dr, int dc, int [][] dir, String [] dirN, String asf){
        if(sr == dr && sc == dc){
            System.out.println(asf);
            return 1;
        }

        int count  = 0;
        for(int d = 0; d < dir.length; d++){
            
            for(int move = 1; move <= Math.max(dr, dc); move++){

                int r = sr + (dir[d][0] * move);
                int c = sc + (dir[d][1] * move);

                if(inRange(r,c,dr + 1, dc + 1)){
                    count += mazePath_02(r,c, dr, dc, dir, dirN, asf + dirN[d]+move);
                }
            }

            
        }
        return count;

    }


    public static void mazePath(){
        int n = 3;
        int m = 4;
        String [] dirN = {"H", "V", "D"};
        int [][] dir = {{0,1}, {1,0}, {1,1}};

        // int ans = mazePath_01(0,0,n-1,m-1,dir, dirN, "");
        int ans = mazePath_02(0,0,n-1,m-1,dir, dirN, "");
        System.out.println(ans);
    }


    //======================================================================================

    public static void main(String [] args){
        mazePath();
    }
}