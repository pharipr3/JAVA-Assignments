import java.util.*; 
class SnackPatternArray 
{ 
    static void Solution(int [][] snake) 
    { 
       
        for (int inti = 0; inti < snake.length; inti++) 
        {   
            
            if (inti % 2 == 0) 
            { 
                for (int intj = 0; intj < snake[0].length; intj++) 
                    System.out.print(snake[inti][intj] +" ");
            } 
           else
            { 
                for (int intj = snake[0].length - 1; intj >= 0; intj--) 
                    System.out.print(snake[inti][intj] +" "); 
            } 
        } 
    } 
  
   
    public static void main(String[] args) 
    { 
        int matrix[][] = new int[][] 
        { 
            { 91, 92, 93, 94 }, 
            { 98, 97, 96, 95 }, 
            { 99, 100, 101, 102 }, 
            { 106, 105, 104, 103 } 
        }; 
  
        Solution(matrix); 
    } 
} 



