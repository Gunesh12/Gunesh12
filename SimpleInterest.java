import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Principal rate");
        int p=sc.nextInt();
        System.out.println("Enter the rate");
        int r=sc.nextInt();
        System.out.println("Enter the time");
        int t=sc.nextInt();
        int si=(p*r*t);
        System.out.println("The simple interest rate is " + si);
    }
}
