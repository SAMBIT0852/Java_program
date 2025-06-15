public class ifelse {
    public static void main(String []args)
    {
        int x,y,z;
        x=3;
        y=4;
        z=5;

        if(x>y && x>z)
        {
            System.out.println(x);
        }
        else if(y>x && y>z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
    }
    
}
