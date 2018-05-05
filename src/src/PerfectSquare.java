package src;

public class PerfectSquare {
	public static long findNextSquare(long sq)
    {      
        long root = (long) Math.sqrt(sq); 
        if (root*root == sq) 
        {
        	long new_root = root + 1;
            return new_root*new_root; 
        }
        else
        {
            return -1; //Return -1 to the call
        }
    }
		  
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
		  
		  System.out.println(PerfectSquare.findNextSquare(114));
		  
	  }
}
