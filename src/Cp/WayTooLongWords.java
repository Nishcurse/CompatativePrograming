package Cp;
import java.util.*;
public class WayTooLongWords{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i=1 ; i <= n ; i++ ){
            String word = sc.next();
            if(word.length()>10){
                System.out.printf("%c%d%c\n",word.charAt(0),word.length()-2,word.charAt(word.length()-1));
            }else {
                System.out.println(word);
            }
        }
    }
}
