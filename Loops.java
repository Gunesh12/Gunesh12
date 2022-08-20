import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        for(initialization; condition ; increment/decrement){
        //body
        }
         */
       /* for(int num=1;num<=5;num++)
        {
            System.out.println(num);
        }*/
      /*  Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<=n;i++)
        {
            System.out.println(i + "");

        }

       */


        //While loops//
        /*
        syntax
        while(condition)

        {
        body
        }
         */

    /*
        int num=1;

        while(num<=5)
        {
          // we use while loop when we dont know how many times we use them
            //for ,loop when we know how many times we use the loop
            System.out.println(num);
            num+=1;
        }*/
        /*
        do {
        //body
        }
        while(condition)
         */
        int num=1;
        do{
            System.out.println(num);
            num++;
        }while(num<=6);


    }
}
