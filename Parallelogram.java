import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the s");
        int s=sc.nextInt();
        System.out.println("Enter the b");
        int b=sc.nextInt();
        double area;
        area=(s+b)/2;
        System.out.println("Area is " +area);
    }
}
