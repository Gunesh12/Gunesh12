import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        //int x1,x2,y1,y2
        int x1,x2,y1,y2;
        double res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x1");
        x1=sc.nextInt();
        System.out.println("Enter the x2");
        x2=sc.nextInt();
        System.out.println("Enter the y1");
        y1=sc.nextInt();
        System.out.println("Enter the y2");
        y2=sc.nextInt();
        res=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The Distance between"+"x1,x2 and y1 y2:   " +res);
    }
}
