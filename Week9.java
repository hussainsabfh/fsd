
class Binding
{
    public void print1()
    {
        System.out.println("Static Binding");
    }
}
public class Week9
{
    public void display()
    {
        System.out.println("Dynamic Binding");
    }
    public static void print()
    {
        System.out.println("Static Binding");
    }
    public static void main(String args[])
    {
        Week9 w=new Week9();
        Binding b=new Binding();
        w.display();
        w.print();
    }
    
}
