import java.util.Scanner;

public class Areaofisocles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double area;
        //h*b
        System.out.println("Enter the height");
        double h=sc.nextDouble();
        System.out.println("Enter the breadth");
        double b=sc.nextDouble();
        area=(h*b);
        System.out.println("Area is " +area);

    }
}
