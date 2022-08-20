import java.util.Scanner;

public class RuppeetoDollar {
    public static void main(String[] args) {
        float rupees;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rupees");
         rupees=sc.nextFloat();
        float dollar=rupees/64;
        System.out.println(dollar);
    }
}
