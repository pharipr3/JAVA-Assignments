class LuckyArray 
{ 
   
	public static boolean distinctValues(int[] Array){
	    for (int inti = 0; inti < Array.length-1; inti++) {
	        for (int intj = inti+1; intj < Array.length; intj++) {
	             if (Array[inti] == Array[intj]) {
	                 return false;
	             }
	        }
	    }              
	    return true;          
	}
      
    
    public static void main (String[] args) 
    { 
    int Array[] = {999, 888, 777, 666, 333, 222};
            if(!distinctValues(Array)) 
            {                
            	System.out.print("Array is not Lucky");    
            } 
            else
            	System.out.print("Array is Lucky");  
        
        
    } 
} 
  