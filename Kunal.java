import java.util.Scanner;

public class Kunal {
    public static void main(String[] args) {
         int noof_days;
         int res;
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of days in a month");
         noof_days=sc.nextInt();
         res=noof_days/2;
        System.out.println("kunal went outside " +res + " days in a month");
    }
}
