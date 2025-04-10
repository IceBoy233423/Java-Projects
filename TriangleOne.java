//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors
   

	public static String go( String let, int size)
	{
	    String output = "";
		for(int row = 1; row <= size; row++){
		    for(int col = 1; col<=row; col++){
		        output = output + let;
		    }
		    output = output + "\n";
		}
		
		
		
		
		return output;
	}
}