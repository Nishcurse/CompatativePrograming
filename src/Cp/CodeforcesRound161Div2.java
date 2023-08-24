package Cp;
import java.util.Scanner;
public class CodeforcesRound161Div2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arry = new int[5][5];
        int targetROw = 0;
        int targetcoloum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                arry[i][j] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arry[i][j] == 1) {
                    targetROw = i + 1;
                    targetcoloum = j + 1;
                }
            }
        }
        int mainrow = Math.abs(targetROw-3);
        int maincoloum = Math.abs(targetcoloum-3);
        System.out.println(maincoloum+mainrow);
    }

}

