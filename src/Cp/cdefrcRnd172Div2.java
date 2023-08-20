package Cp;
import java.util.Scanner;
public class cdefrcRnd172Div2 {
    public static void main(String[] args) {
        Scanner mw = new Scanner(System.in);
        String word = mw.next();
        String Capitalised_Word = word.substring(0, 1).toUpperCase() + word.substring(1);
        System.out.println(Capitalised_Word);
    }
}
