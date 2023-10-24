import java.util.ArrayList;
import java.util.Scanner;

public class ratmaze {
    public static int floodfill(int sr , int sc , int[][] vis, String psf, ArrayList<String>res, int[][] dir, String[]dirs){
        int n = vis.length, m = vis[0].length;
        if(sr ==n -1 && sc== m-1){
            res.add(psf);
            return 1;
        }
        vis[sr][sc]=0 ;
        int  count = 0 ;
        for(int d = 0 ;d<dir.length;d++){
            int r = sr+dir[d][0];
            int c = sc + dir[d][1];
            if(r>=0 && c>=0 && r<n && c< m &&  vis[r][c]==1){
                count+= floodfill(r,c,vis,psf+dirs[d],res,dir,dirs);


            }
        }
        vis[sr][sc]=1;
        return count;

    }
    public static ArrayList<String> findpath(int[][]m, int n){
        int[][]dir = {{1,0},{0,-1},{0,1},{-1,0}};
        String[] dirs={"D","L","R","U"} ;
        ArrayList<String> res = new  ArrayList<String>();
        if (m[0][0]==0 || m[n-1][n-1]==0)
            return res ;
        int count = floodfill(0,0,m,"",res,dir,dirs);
        return res ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        ArrayList<String>paths = findpath(arr,8);
        System.out.println(paths);
    }

}

