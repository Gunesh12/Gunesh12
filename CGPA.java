import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        double english,telugu,hindi;
        double res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the english marks");
        english=sc.nextDouble();
        System.out.println("Enter the telugu marks");
        telugu=sc.nextDouble();
        System.out.println("Enter the hindi marks");
        hindi=sc.nextDouble();
        res=(english+telugu+hindi)/3;
        System.out.println("The total cgpa is "+res);
    }
}
