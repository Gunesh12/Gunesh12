import java.util.Scanner;

public class DepreciationOfValue{
    public static void main(String[] args) {
        long cost,dp_per,year,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real cost");
        cost=sc.nextLong();
        System.out.println("Enter the depreciation percentage");
        dp_per=sc.nextLong();
        System.out.println("Enter the year");
        year=sc.nextLong();
        result=cost;
        for(int i=1;i<year;i++)
        {
            result=(100-dp_per)*cost/100;
        }
        System.out.println("Before depreciation value" +cost);
        System.out.println("After depreciation value" +result);

    }
}
