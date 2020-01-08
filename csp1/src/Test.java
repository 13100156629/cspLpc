import java.util.Scanner;

/**
 * 试题编号：	201512-1
 * 试题名称：	数位之和
 * 时间限制：	1.0s
 * 内存限制：	256.0MB
 * 问题描述：
 * 问题描述
 *
 * 　　给定一个十进制整数n，输出n的各位数字之和。
 *
 * 输入格式
 *
 * 　　输入一个整数n。
 *
 * 输出格式
 *
 * 　　输出一个整数，表示答案。
 *
 * 样例输入
 *
 * 20151220
 *
 * 样例输出
 *
 * 13
 *
 * 样例说明
 *
 * 　　20151220的各位数字之和为2+0+1+5+1+2+2+0=13。
 *
 * 评测用例规模与约定
 *
 * 　　所有评测用例满足：0 ≤ n ≤ 1000000000。
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = 0;
        int sum = 0;
        while (n != 0){
            temp = n % 10;
            sum = sum + temp;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
