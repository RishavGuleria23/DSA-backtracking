import java.util.ArrayList;
import java.util.Scanner;
//this is for getmazepath method**
public class mazepath {
    public static ArrayList<String> printmazepath(int sr , int sc , int dr , int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        ArrayList<String> vpaths = new ArrayList<>();
        ArrayList<String> hpaths = new ArrayList<>();
        if(sc<dc){
            hpaths = printmazepath(sr,sc+1, dr ,dc);

        }
        if(sr<dr){
            vpaths = printmazepath(sr+1, sc, dr, dc);

        }
        ArrayList<String> paths = new ArrayList<>();
        for(String hpath : hpaths){
            paths.add("h" + hpaths);

        }
        for(String vpath : vpaths){
            paths.add("v" + vpath);
        }
        return paths;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String>paths = printmazepath(1,1,n,m);
        System.out.println(paths);

    }
}
