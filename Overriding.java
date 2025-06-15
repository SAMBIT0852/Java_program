 class A {
    protected int a;
    A(int a)
    {
        this.a = a;
    }
        void EvenOdd()
        {
            System.out.println();
        }
    
        }
    

class B extends A{
    B(int n)
    {
        super(n);
    }
        void EvenOdd()
        {
            if(a%2==0)
            {
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
public class Overriding{
    public static void main(String[]args)
    {
        B obj = new B(5);
        obj.EvenOdd();
    }

    
}

