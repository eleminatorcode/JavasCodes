import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int flag=0;
       String num=String.valueOf(n);
       int length= num.length();
       for(int i=0;i<length/2;i++){
       if(num.charAt(i)== num.charAt(length-(i+1))){
           flag=1;
        }
       else {
           flag=0;
       }
       }
       if(flag==1)
        System.out.println("true");
       else{
           System.out.println("false");
       }

    }
}
