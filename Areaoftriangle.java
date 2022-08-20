import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // area of trianglre=1/2*b*h;
        System.out.println("Enter the breadth");
        double b=sc.nextDouble();
        System.out.println("Enter the height");
        double h=sc.nextDouble();
        double area;
        area=(b*h)/2;
        System.out.println("Area of triangle " +area);

    }
}
