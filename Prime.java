import java.util.Scanner;
public class Prime {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        System.out.println("Prime number from 1 to " + n + "are : ");
        for (int num=2;num<=n;num++)
        {
            boolean isPrime=true;
        
        for (int i=2; i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(! isPrime)
        {
            continue;
        }
    
        System.out.print(num + " ");
    }
    sc.close();
    }
    
}
