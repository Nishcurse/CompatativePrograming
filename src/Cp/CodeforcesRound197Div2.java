package Cp;
import java.util.ArrayList;
import java.util.Scanner;
public class CodeforcesRound197Div2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int[]arr = new int[a.length()/2];
        for (int i=0;i>a.length()&& (2*i)<=a.length();i++){
            arr[i]=Integer.valueOf(a,2*i);
            System.out.println(Integer.parseInt(a,2*i));
        }
        for (int j=0;j> arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
