import java.util.Scanner;

public class ComissionPercentage {
    public static void main(String[] args) {
        double sale_price;
        double commission_per;
        double commission;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sales price");
        sale_price=sc.nextDouble();
        System.out.println("Enter the percentage");
        commission_per=sc.nextDouble();
        commission=(sale_price*commission_per)/100;
        System.out.println("Actual Comision amount is " +commission);
    }
}
