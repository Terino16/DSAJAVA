
import java.util.*;
public class Magicnumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=1; int base=0;
        while(n>0)
        {
           base +=(n&1)*Math.pow(5,i);
           i++;
           n=n>>1;
        }
        System.out.println(base);

    }

}
