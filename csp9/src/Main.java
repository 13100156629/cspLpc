import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int r = scanner.nextInt();
        final int y = scanner.nextInt();
        final int g = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i=0;i<n;i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        int time = 0;
        for (int i=0;i<n;i++){
            if (arr[i][0] == 0){
                time = time + arr[i][1];
            }else if (arr[i][0] == 1){
                time = time + arr[i][1];
            }else if (arr[i][0] == 2){
                time = time + arr[i][1] + r;
            }
        }
        System.out.println(time);
    }
}
