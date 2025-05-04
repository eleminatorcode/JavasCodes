import java.util.Scanner;

public class primeton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();

        System.out.println(1);
        for (int i=2;i<=a;i++){
            Boolean isPrime = true;

            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }

            }
            if(isPrime){
                System.out.println(i);
            }
        }


        }
    }

