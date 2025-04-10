//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class SpiralMatrixRunner
{
	public static void main( String args[] ) 
	{
	  SpiralMatrix runner = new SpiralMatrix();
	  runner.setSize(5);
	  System.out.println(runner);
	  
	  runner.setSize(8);
	  System.out.println(runner);
	  
	  runner.setSize(7);
	  System.out.println(runner);
	  
	  runner.setSize(3);
	  System.out.println(runner);
	  
	  runner.setSize(2);
	  System.out.println(runner);
	  
	  runner.setSize(1);
	  System.out.println(runner);
	}
}