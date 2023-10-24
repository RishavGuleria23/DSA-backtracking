import java.util.Scanner;

public class rishav {

    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }



        int facto = factorial(n-1);
        int factoo = n*facto;
        return factoo;



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int ans = factorial(n);
        System.out.println(ans);

    }}



