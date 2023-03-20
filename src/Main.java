import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for( int i=0;i<=2*a;i++)
        {
            if(i<a)
            {
            for( int j=0;j<=a;j++)
            {
                if(  j<=i|| j==0)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            }
            else
            {
            for( int j=0;j<=a;j++)
            {
                if(i==0 || i<=j+a )
                System.out.print("*  ");
                else
                    System.out.print("  ");

            }

        }
            System.out.println();
        }


}
}