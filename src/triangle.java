import java.util.*;
public class triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int j;
        for (int i = 0; i < n; i++) {

            for (j=n-i+1; j >0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print(count+" ");
            }
            count++;
            System.out.println('\n');
        }

    }
}
