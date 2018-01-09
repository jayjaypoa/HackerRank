import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        
        // Transforma magazine em lista
        List<String> lista = new ArrayList<String>();
        lista = Arrays.asList(magazine);
        
        
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();       
                        
            String elem = ransom[ransom_i];
            int pos = lista.indexOf(elem);
            if (pos < 0){
            	System.out.println("No");
            	System.exit(0);
            } else {
            	lista.set(pos, "");
            }
            
        }
        
        System.out.println("Yes");
        
        
    }
    
}
