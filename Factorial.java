import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        for(i=1;i<=10;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }

    }
}
