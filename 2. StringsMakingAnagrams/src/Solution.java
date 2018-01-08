import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static int numberNeeded(String first, String second) {
    	
    	int remover = 0;
    	StringBuilder str = new StringBuilder(second);
    	
        // obtem tamanho da string 2
    	int tamanho2 = second.length();
    	
    	// percorre a string 1
    	for(int i=0; i <= first.length()-1; i++){
    		
    		// obtem o caracter da string 1
    		char c = first.charAt(i);
    		
    		// verifica se o char está presente na string 2
    		int pos = str.indexOf(c+"");

    		// se houver alguma ocorrencia na string 2
    		if (pos >= 0){
                // retira o caracter da string 2
    			str = str.replace(pos, pos+1, "");
    		} else {
    			remover++;
    		}
    		
    	}
    	
        // calcula a qtd de elementos retirados da string 1
        // e soma com o que sobrou da string 2
    	remover = remover + str.length();
    	
    	return remover;
    }
  
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe a string A:");
        String a = in.next();  // "fcrxzwscanmligyxyvym";
        
        System.out.println("Informe a string B:");
        String b = in.next();  // "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        
        System.out.println("\nResultado:"); 	
        System.out.println(numberNeeded(a, b));  // Resultado esperado = 30
        
    }
    
}
