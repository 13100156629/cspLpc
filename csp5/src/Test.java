import java.util.HashMap;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int[] ns = new int[n];
       HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
       for (int i = 0;i < n;i++) {
           ns[i] = scanner.nextInt();
           hashMap.put(ns[i],0);
       }
        for (int a : ns) {
            hashMap.put(a,hashMap.get(a)+1);
            System.out.print(hashMap.get(a) + " ");
        }
        /*for (int i = 0;i < n;i++) {
            hashMap.put(ns[i],hashMap.get(ns[i])+1);
            System.out.print(hashMap.get(ns[i]) + " ");
        }*/
    }
}
