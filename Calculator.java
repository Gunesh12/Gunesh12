import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        while(true)
        {
            System.out.println("Enter the operator:");
            char op=sc.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*'||op=='/')
            {
                System.out.println("Enter the first number:");
                int n1=sc.nextInt();
                System.out.println("Enter the 2nd number:");
                int n2=sc.nextInt();
                if(op=='+')
                {
                    ans=n1+n2;
                    System.out.println("The addition is:" + ans);
                } else if (op=='-') {
                    ans=n1-n2;
                    System.out.println("The Subtraction is:" + ans);
                } else if (op=='*') {
                    ans=n1*n2;
                    System.out.println("The Multiplication is:" + ans);
                } else if (op=='/') {

                    ans=n1/n2;
                    System.out.println("The division is:" +ans);
                } else if (op=='x'|| op=='X') {
                    break;
                    
                }
                else {
                    System.out.println("Invalid");
                }

            }
        }
    }
}
