package Cp;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class cdefrcRound290Div2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputsepbyspace = sc.nextLine();
        String[]inputs = inputsepbyspace.split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        for(int i=1;i<=n;i++) {
            int nextindex = i / 2;
            if (i % 2 != 0) {
                for (int z = 0; z < m; z++) {
                    System.out.print("#");
                }System.out.print("\n");
            } else if (i % 2 == 0 && nextindex % 2 == 0) {
                System.out.print("#");
                for (int k = 0; k < m - 1; k++) {
                    System.out.print(".");
                }System.out.print("\n");
            } else if (i % 2 == 0 && nextindex % 2 != 0) {
                for (int l = 0; l < m - 1; l++) {
                    System.out.print(".");
                }
                System.out.print("#\n");
            }
        }
        }
    }
