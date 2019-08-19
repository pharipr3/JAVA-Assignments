import java.io.*; 
import java.util.Arrays; 
import java.util.Collections; 
public class Anagrams {
	static boolean IsAnagram(char[] firststr, char[] Secondstr) 
    { 
        
        int firstnum = firststr.length; 
        int secondnum = Secondstr.length; 
  
        
        if (firstnum != secondnum) 
            return false; 
  
        
        Arrays.sort(firststr); 
        Arrays.sort(Secondstr); 
  
       
        for (int inti = 0; inti < firstnum; inti++) 
            if (firststr[inti] != Secondstr[inti]) 
                return false; 
  
        return true; 
    } 
	public static void main(String[] args) {
		char arryFirst[] = { 'l', 'i', 's', 't','e','n' }; 
        char arrySecond[] = { 's', 'i', 'l', 'e','n','t' }; 
        if (IsAnagram(arryFirst, arrySecond)) 
            System.out.println("The two strings are anagram of each other"); 
        else
            System.out.println("The two strings are not anagram of each other"); 

	}

}
