package Cp;
import java.util.Scanner;
public class codeforces_Beta_Round_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String areialinputs = sc.nextLine();
        String[]area = areialinputs.split(" ");
        int m = Integer.valueOf(area[0]);
        int n = Integer.valueOf(area[1]);
        int aera = m*n;
        int output = aera/2;
        System.out.println(output);
    }
}
