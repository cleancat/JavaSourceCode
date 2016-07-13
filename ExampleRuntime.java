public class ExampleRuntime
{
	public static void main(String []args)
    {
       try
       {
		Runtime rt=Runtime.getRuntime();
		rt.exec("java Example3");
       }
       catch (Exception e)
       {
		   System.out.println(e);
       }
	}
}