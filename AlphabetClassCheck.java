import java.util.Scanner;

public class AlphabetClassCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("Lowercase");
        }
        else {
            System.out.println("UpperCase");
        }
    }
}
