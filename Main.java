import java.lang.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1 \n");
        int num=sc.nextInt();
        if(num%2!=0)
        {
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }
}
