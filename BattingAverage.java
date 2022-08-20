import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        int runs;
        int out;
        double avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the runs scored by the batsman");
        runs=sc.nextInt();
        System.out.println("Enter the number of times batsman got out: ");
        out=sc.nextInt();
        avg=(runs/out);
        System.out.println("The batting average of the batsman in odis is " +avg);

    }

}
