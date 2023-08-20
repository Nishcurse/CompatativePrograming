import java.util.Scanner;
public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int frequency = 0 ;
        int count = 0;
        for (int i=0;i<name.length();i++){
            char a = name.charAt(i);
            for (int j=0;i<name.length();i++){
                char b = name.charAt(j);
                if (a==b){
                    frequency += 1 ;
                }else {
                    count = 1;
                }
                System.out.println(count);
                }
            }
        }
    }
