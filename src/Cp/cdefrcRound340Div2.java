package Cp;
import java.util.Scanner;
public class cdefrcRound340Div2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        if (position<5){
            System.out.println(1);
        } else if ( position >5 && position%5!=0 ) {
            System.out.println(position/5+1);
        }else {
            System.out.println(position/5);
        }
    }
}
