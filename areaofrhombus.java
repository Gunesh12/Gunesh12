import java.util.Scanner;

public class areaofrhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //pi.r
        System.out.println("Enter the radius");
        int r= sc.nextInt();
        double area;
        area=Math.PI*r;
        System.out.println("Area is " +area);
    }
}
