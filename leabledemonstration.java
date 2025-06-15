public class leabledemonstration {
    public static void main(String[]args)
    {
        Outerloop:
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<4;j++)
            {
                    if(i==2 && j==2)
                    {
                        System.out.println("Breaking outer for loop");
                        break Outerloop;
                    }
                     
            }
            System.out.println("loop exited");
        }

    }
    
}
