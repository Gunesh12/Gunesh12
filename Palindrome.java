import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int temp=n;
        int rev= temp;
        if(temp==rev)
        {
            System.out.println("Palindrome");

        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
