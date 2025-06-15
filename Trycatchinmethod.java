public class Trycatchinmethod {
    public double Area(double r)
    {
        return(3.14*r*r);
    }
    public int Area(int l, int b)
    {
        return(l*b);
    }
    public int Area(int x, int y, int z)
    {
        return(x*y*z);
    }
    public static void main(String[]args)
    {
        Trycatchinmethod obj=new Trycatchinmethod();
        try{
            System.out.println("Area of the circle is : "+ obj.Area(2.5));
            System.out.println("Araea of the rectangle is : "+obj.Area(2,3));
            System.out.println("Area of the box is : "+obj.Area(1,2,3));
        }
        catch(Exception e)
        {
            System.out.println("Invalid sysntax");
        }
    }
}
