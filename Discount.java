import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the original price");
        int op=sc.nextInt();
        System.out.println("Enter the discount price");
        int dp=sc.nextInt();
        double result;
        result=(dp/op) *100;
        System.out.println("The Actual Discount amount is "+ result);
    }
}
