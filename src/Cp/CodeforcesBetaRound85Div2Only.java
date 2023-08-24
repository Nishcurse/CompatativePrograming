package Cp;
import java.util.Scanner;
public class CodeforcesBetaRound85Div2Only {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c =a.toLowerCase();
        String d =b.toLowerCase();
        int z = c.compareTo(d);
        if(z>0){
            System.out.println(1);
        }else if (z<0){
            System.out.println(-1);
        }else {
            System.out.println(z);
        }
    }
}
