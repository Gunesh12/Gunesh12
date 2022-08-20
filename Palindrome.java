import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n,rev;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();
        int temp=n;
        rev=temp;
        if(temp==rev)
        {
            System.out.println("The Number is Palindrome");
        }
        else {
            System.out.println("The Number is not palindrome");
        }


    }
}
