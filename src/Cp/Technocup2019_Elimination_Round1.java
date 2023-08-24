import java.util.Scanner;
public class Technocup2019_Elimination_Round1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] real = new int[a];

        for (int i = 0; i < a; i++) {
            real[i] = sc.nextInt();
        }

        boolean isHard = false;

        for (int i : real) {
            if (i == 1) {
                isHard = true;
                break;
            }
        }

        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }
}