package Cp.A_SoldierAndBananas;
import java.util.Scanner;
public class CodeforcesRound304Div2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]values= new int[3];
        for (int i=0;i<values.length;i++){
            values[i]=sc.nextInt();
        }
        int requiredMoney = 0;
        int price = values[0];
        int backbal = values[1];
        int noOfBananas = values[2];
        for (int j=1;j<=noOfBananas;j++){
            requiredMoney += j * price;
        }
        if (requiredMoney>backbal){
            System.out.println(requiredMoney-backbal);
        }else {
            System.out.println(0);
        }
    }
}
