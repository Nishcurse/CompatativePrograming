package Cp;
import java.util.Scanner;
public class CodeforcesRound173Div2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            String operator = sc.next();
            if (operator.contains("++")) {
                x += 1;
            } else if (operator.contains("--")) {
                x -= 1;
            }
        }
        System.out.println(x);
    }
}
