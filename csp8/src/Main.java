import java.util.Scanner;

/**
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 小中大
 * 60
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int max = 0;
        int mid = 0;
        int min = 0;
        if ((n%2) == 0) {
            mid = (arr[(n-1)/2]+arr[(n-1)/2+1])/2*10;
        }else {
            mid = arr[(n-1)/2]*10;
        }
        String m;
        if (mid%10 == 5) {
            m = mid/10.0 +"";
        }else {
            m = mid/10 +"";
        }
        for (int i=0;i<n-1;i++) {
            if (arr[i] < arr[i+1]) {
                max = arr[n-1];
                min = arr[0];
                break;
            }else if (arr[i] == arr[i+1]) {
                continue;
            }else {
                max = arr[0];
                min = arr[n-1];
            }
        }
        System.out.println(max+" "+m+" "+min);
    }
}
