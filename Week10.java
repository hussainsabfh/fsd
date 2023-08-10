abstract class CSE
{
	abstract void putData();
	int code=446;
}
interface EC
{
	public void showData();
	final String place="Yeshwantnagar";
}
class Sanpoly extends CSE implements EC
{
	void putData()
	{
		System.out.println("Sandur Polytechnic");
		System.out.println("College Code is "+code);
	}
	public void showData()
	{
		System.out.println("Place is "+place);
	}
}

public class Week10
{
	public static void main(String args[])
	{
		
		//CSE c1=new Sanpoly();
                Sanpoly s=new Sanpoly();
                s.putData();
		s.showData();
                //c1.putData();
               // c1.showData();
		
	}
}