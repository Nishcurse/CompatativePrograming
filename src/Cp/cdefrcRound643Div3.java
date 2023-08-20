package Cp;
import java.util.Scanner;
public class cdefrcRound643Div3 {
    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);
        int z = mc.nextInt();
        for(int i=0;i<z;i++) {
            int a = mc.nextInt();
            if (a % 2 == 0) {
                System.out.println(a / 2 - 1);
            } else {
                int b = a / 2;
                System.out.println(b);
            }
        }
    }
}
