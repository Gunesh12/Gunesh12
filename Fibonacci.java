import java.util.Scanner;
// this program is about for output which fibonacci u want
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,count=0;
        while(count<=n)
        {
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println("The fibonacci number is" + b);
    }
}
