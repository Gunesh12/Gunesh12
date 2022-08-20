import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
       /* int max;
        if(num1>num2)
        {
            max=num1;
        } else if (num2>num3) {
            max=num2;
        }
        else {
            max=num3;
        }
        System.out.println("The Largest Number is " +max);

        */
        int max=Math.max(num3,Math.max(num1,num2));
        System.out.println(max);
    }
}
