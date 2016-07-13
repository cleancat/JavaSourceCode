public class ExampleRuntime1
{
	public static void main(String []args)
	{
	     try
	     {
			Runtime rt=Runtime.getRuntime();
			rt.exec("c:/windows/system32/calc.exe");
	     }
	     catch (Exception e)
	     {
			 System.out.println(e);
	     }
	}
}