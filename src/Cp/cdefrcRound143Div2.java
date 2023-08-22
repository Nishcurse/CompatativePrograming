package cp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class cdefrcRound143Div2 {
    public static void main(String[] args)
    throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int problemssolved =0;
        String[] input;
        for (int i = 0; i < n; i++){
        input = bi.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int z = a+b+c;
        if (z>1){
            problemssolved +=1;
        }
    }
        System.out.println(problemssolved);
    }
}