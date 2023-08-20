package Cp;
import java.util.Scanner;
public class cdefrc_beta_round55Div2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upperCaseCount,LowerCaseCount;
        upperCaseCount=0;
        LowerCaseCount=0;
        String word = sc.next();
        for (int i =0;i< word.length();i++){
            char a = word.charAt(i);
            if (Character.isUpperCase(a)){
                upperCaseCount +=1;
            }else {
                LowerCaseCount +=1;
            }
        }
        if(upperCaseCount>LowerCaseCount){
            System.out.println(word.toUpperCase());
        }else {
            System.out.println(word.toLowerCase());
        }
    }
}
