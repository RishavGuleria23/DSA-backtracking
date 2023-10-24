import java.util.Scanner;

public class minimax {
    public static int max (int[]arr, int idx){
        if (idx == arr.length-1 ) {

            return arr[idx];
        }
        int misa = max(arr,idx+1);
        if(misa>arr[idx]){
            return misa;
        }
        else{
            return arr[idx];
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int maxx = max(arr,0);
        System.out.println(maxx);



    }
}
