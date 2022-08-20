import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pi=3.14f;
        int r=sc.nextInt();
        double area;
        area= (r*r)+pi;
        System.out.println("THe area is" +area);

    }
}
