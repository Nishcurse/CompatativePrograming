package Cp;
import java.util.Scanner;
public class newclass {
     static int meth1() {
        Scanner sc = new Scanner(System.in);
        String inputsepbyspace = sc.nextLine();
        String[] inputs = inputsepbyspace.split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        int z = Integer.parseInt(inputs[2]);
        int result = x + y + z;
        int answerable = 0;
        if (result > 1) {
            answerable += 1;
        }
        return answerable;
    }
        public static void main(String[] args) {
         Scanner mw = new Scanner(System.in);
        int arm = mw.nextInt();
        int w=0 ;
        for (int i=0;i<arm;i++){
            int q =newclass.meth1();
            if(q==1){
                w++;
            }
        }System.out.println(w);
    }
}

