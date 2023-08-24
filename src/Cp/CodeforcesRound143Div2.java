package Cp;
import java.util.Scanner;
public class CodeforcesRound143Div2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] real = new int[3];
        int noOFproblems = 0;
        for (int j = 0; j < a; j++) {
            int aloo =0;
            for (int i = 0; i < 3; i++) {
                real[i] = sc.nextInt();
            }
            for(int ele:real){
                aloo += ele;
//                System.out.println( "aloo:"+aloo);
            }
            if(aloo>1){
                noOFproblems +=1;
//                System.out.println("noOFproblems:"+noOFproblems);
            }
        }
        System.out.println(noOFproblems);
    }
}
