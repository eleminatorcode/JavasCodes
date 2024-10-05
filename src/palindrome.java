import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(((i+1)-k));
            }

                for (int j = 2; j <= i; j++) {
                    System.out.print(j);
                }
            System.out.println();
        }



    }
}
