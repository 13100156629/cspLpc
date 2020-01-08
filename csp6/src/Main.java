import java.util.Scanner;

/**
 * 试题编号：	201412-2
 * 试题名称：	Z字形扫描
 * 时间限制：	2.0s
 * 内存限制：	256.0MB
 * 问题描述：
 * 问题描述
 * 　　在图像编码的算法中，需要将一个给定的方形矩阵进行Z字形扫描(Zigzag Scan)。给定一个n×n的矩阵，Z字形扫描的过程如下图所示：
 *
 * 　　对于下面的4×4的矩阵，
 * 　　1 5 3 9
 * 　　3 7 5 6
 * 　　9 4 6 4
 * 　　7 3 1 3
 * 　　对其进行Z字形扫描后得到长度为16的序列：
 * 　　1 5 3 9 7 3 9 5 4 7 3 6 6 4 1 3
 * 　　请实现一个Z字形扫描的程序，给定一个n×n的矩阵，输出对这个矩阵进行Z字形扫描的结果。
 * 输入格式
 * 　　输入的第一行包含一个整数n，表示矩阵的大小。
 * 　　输入的第二行到第n+1行每行包含n个正整数，由空格分隔，表示给定的矩阵。
 * 输出格式
 * 　　输出一行，包含n×n个整数，由空格分隔，表示输入的矩阵经过Z字形扫描后的结果。
 * 样例输入
 * 4
 * 1 5 3 9
 * 3 7 5 6
 * 9 4 6 4
 * 7 3 1 3
 * 样例输出
 * 1 5 3 9 7 3 9 5 4 7 3 6 6 4 1 3
 * 评测用例规模与约定
 * 　　1≤n≤500，矩阵元素为不超过1000的正整数。
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] nn = new int[n][n];
        for (int i = 0;i < n;i++) {
            for (int j = 0;j < n;j++) {
                nn[i][j] = scanner.nextInt();
            }
        }

        final int RIGHT = 0,LEFT_DOWN = 1,DOWN = 2,RIGHT_UP = 3;
        int count = 0,i = 0,j = 0,dir = 0;
        while (count < n*n) {
            System.out.print(nn[i][j] + " ");
            switch (dir){
                case RIGHT:
                    j++;
                    dir = i == 0 ? LEFT_DOWN : RIGHT_UP;
                    break;
                case LEFT_DOWN:
                    i++;
                    j--;
                    if (i == n-1) {//左下角怎么判断，条件重复？
                        dir = RIGHT;
                    } else if (j == 0) {
                        dir = DOWN;
                    }
                    break;
                case DOWN:
                    i++;
                    dir = j == 0 ? RIGHT_UP : LEFT_DOWN;
                    break;
                case RIGHT_UP:
                    i--;
                    j++;
                    if (j == n-1){//右上角怎么判断，重复听谁的？
                        dir = DOWN;
                    } else if (i == 0){
                        dir = RIGHT;
                    }
                    break;
            }
            count++;
        }
    }
}
