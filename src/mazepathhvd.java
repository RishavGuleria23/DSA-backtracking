import java.util.ArrayList;
import java.util.Scanner;

public class mazepathhvd {
    public static ArrayList<String> mazepath1(int sr, int sc, int er, int ec) {
        if (sc == ec && sr == er) {
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }
        ArrayList<String> myans = new ArrayList<>();
        if (sr + 1 <= er) {
            ArrayList<String> vertical = mazepath1(sr + 1, sc, er, ec);
            for (String S : vertical) {
                myans.add("V" + S);
            }
        }
        if (sc + 1 <= ec) {
            ArrayList<String> horizontal = mazepath1(sr, sc + 1, er, ec);
            for (String S : horizontal) {
                myans.add("H" + S);
            }
        }
        if (sr + 1 <= er && sr + 1 <= er) {
            ArrayList<String> diagnol = mazepath1(sr + 1, sc + 1, er, ec);
            for (String S : diagnol) {
                myans.add("D" + S);
            }
        }
        return myans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String>paths = mazepath1(1,1,n,m);
        System.out.println(paths);
    }}


