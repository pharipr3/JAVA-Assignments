
class Frequency {  
    
    static boolean Frequency(int number) 
    { 
        String str = "" + number; 
        boolean isResult = true; 
  
       
        int[] achieved = new int[10]; 
        int inti = 0; 
        int ArryLength = str.length(); 
  
        for (inti = 0; inti < ArryLength; inti++) 
  
           
        	achieved[str.charAt(inti) - '0']++; 
  
        for (inti = 0; inti < 9; inti++) { 
  
            
            if (achieved[inti] != achieved[inti + 1]) 
            	isResult = false; 
        } 
  
        
        if (isResult) 
            return true; 
        else
            return false; 
    } 
  
    
    public static void main(String[] args) 
    { 
        int number = 1223334444; 
        boolean flag = Frequency(number); 
  
        if (flag) 
            System.out.println("All digits are same frequency"); 
        else
            System.out.println("All digits are in different frequency"); 
    } 
} 