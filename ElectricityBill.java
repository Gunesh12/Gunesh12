import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // rate,kilowatt consume
        int units = sc.nextInt();
        double rate = sc.nextDouble();
        double bill;
        if (units < 50) {
            bill = 2.60 * units;
            System.out.println(bill);
        } else if (units < 100) {
            bill = 130 + (units - 50) * 3.25;
            System.out.println(bill);
        } else if (units < 200) {
            bill = 130 + 162.50 + (units - 100) * 5.26;
            System.out.println(bill);
        }


    }
}
