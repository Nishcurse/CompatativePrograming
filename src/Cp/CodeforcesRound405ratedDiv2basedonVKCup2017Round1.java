package Cp;
import java.util.Scanner;
public class CodeforcesRound405ratedDiv2basedonVKCup2017Round1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[2];
        for(int i = 0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int year = 0 ;
        int Limakweight =arr[0];
        int Bobweight =arr[1];
        if(Limakweight==Bobweight){
            System.out.println(1);
        }else {
            for(;;){
                year++;
                Bobweight *= 2;
                Limakweight *= 3;
                if(Limakweight>Bobweight){
                    break;
                }
            }
            System.out.println(year);
        }
    }
}
