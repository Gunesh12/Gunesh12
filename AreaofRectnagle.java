import java.util.Scanner;

public class AreaofRectnagle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double area;
        //area of rectangle=width* height
        System.out.println("Enter the width ");
        double width=sc.nextDouble();
        System.out.println("Enter the height ");
        double height=sc.nextDouble();
        area=(width*height);
        System.out.println("Area of the rectangle " +area);

    }
}
