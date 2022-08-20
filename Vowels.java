import java.util.Objects;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
      char ch;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the character");
        ch=sc.next().trim().charAt(0);
        if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Vowels");
        }
        else
        {
            System.out.println("Consonants");
        }

    }
}
