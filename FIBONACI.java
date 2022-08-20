import java.util.Scanner;

public class FIBONACI {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
       int a=0,b=1,i=0;
       while(i<=n)
       {
           int temp=b;
           b=a+b;  //condition
           a=temp;
           i++;

       }
        System.out.println(i);
    }
}
