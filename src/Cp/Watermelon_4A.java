package Cp;
import java.util.Scanner;
public class Watermelon_4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        if (w%2 ==0 && w>2){  //kyuki for example take 2 divisible by 2 our answer would be yes but how the fuck you would divide two into two even intregal wiight brother )
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
