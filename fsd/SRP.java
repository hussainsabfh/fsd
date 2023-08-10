class Addition
{
	public int add(int x,int y)
	{
		return (x+y);
	}
}

class Subtraction
{
	public int sub(int x,int y)
	{
		return (x-y);
	}
}


public class SRP {
    public static void main(String args[])
    {
        Addition ad=new Addition();
        Subtraction sb=new Subtraction();
        System.out.println("The sum is "+ad.add(3, 4));
        int x=sb.sub(5, 2);
        System.out.println("The difference is "+x);
    }
    
}
