//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class SpiralMatrix
{
	int[][] matrix;
	private static int s;

	public SpiralMatrix()
	{
	    s= 0;
	    matrix = new int[0][0];
	}

	public SpiralMatrix(int size)
	{
	    s = size;
	    matrix = new int[s][s];
	    createSpiral();
	}
	
	public void setSize(int size)
	{
	    s = size;
	    matrix=  new int[s][s];
	    createSpiral();
	}

	public void createSpiral()
	{
	    int bottom = s - 1;
	    int top = 0;
	    int left = 0;
	    int right = s-1;
	    int numberInSpiral = 1;
	    
	    
	    while(top <= bottom && left <= right) //certain condition to keep spiral going
	    {
	    for(int i = top; i <= bottom; i++){
	        matrix[i][left] = numberInSpiral++;
	    }
	    left++;// top to bottom
	    for(int i = left; i <= right; i++){
	        matrix[bottom][i] = numberInSpiral++;
	    }
	    bottom --;//left to right
	    for(int i = bottom; i >= top; i--){
	        matrix[i][right] = numberInSpiral++;
	    } 
	    right--;//bottom to top
	    for(int i = right; i >= left; i--){
	        matrix[top][i] = numberInSpiral++;
	    } 
	    top++;//right to left
	    }
	}

	public String toString( )
	{
		String output="";
		for(int i = 0; i < s; i++){
		    for(int j = 0; j < s; j++){
		        output = output + matrix[i][j] + " ";
		    }
		    output= output + "\n";
		}
		return output;
	}
}