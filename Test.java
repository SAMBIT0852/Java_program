class A{
    int a;
    A()
    {
        a=1;
        System.out.println("This is a message from default constructor "+ a);
    }
    A(int a)
    {
        this.a=a;
        System.out.println("This is a message from parameterised constructor constructor "+ a);
    }
    A(A obj)
    {
        this.a= obj.a;
        System.out.println("This is a messsage from copid constructor "+ a);
    }

}
class B extends A{
    B()
    {
        super();
    }

    B(int a)
     {
        super(a);
    }
        
    
}
public class Test
{
    public static void main(String[]args)
    {
        B obj=new B();
        B obj1=new B(20);

    }
}
    

