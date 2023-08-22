package Cp;
import java.util.Scanner;
public class VkCup_2012Qualificationround1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String values = sc.nextLine();
        String[] inputs = values.split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        String raju = sc.nextLine();
        String[] numbers =raju.split(" ");
        int[]real = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            real[i]=Integer.valueOf(numbers[i]);
        }int output =0;
        for(int j=0;j< real.length;j++){
            if (real[j]>=real[b-1]&&real[j]>0){
                output += 1;
            }
        }
        System.out.println(output);
    }
}