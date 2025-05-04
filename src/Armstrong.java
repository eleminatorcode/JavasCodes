import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original=num;
        int result = 0;
        int len = String.valueOf(num).length();
        System.out.println(len);
       while(num!=0) {
            int rem = num % 10;
            result  += Math.pow(rem,len);
           System.out.println(result);
            num/=10;
        }
        if(result==original){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

