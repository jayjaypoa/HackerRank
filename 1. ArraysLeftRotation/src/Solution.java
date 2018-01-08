import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
          	    	
    	// Guarda o primeiro elemento
    	int elem = a[0];
    	
    	// Move todos os elementos 1 (uma) casa para a esquerda.
    	// Começa movendo da esquerda para a direita.
    	for(int i = 1; i < n; i++){
    		a[i-1] = a[i];
    	}
    	
    	// Repassa o primeiro elemento para a última posição do vetor resultante.
    	a[n-1] = elem;    	
    	
    	// elimina uma rotacao
    	k--;

    	// Realiza mais uma rotacao
    	if (k > 0){
    		a = arrayLeftRotation(a, n, k);
    	} else {
    		// retorna o vetor resultante
    		return a;    		
    	}    	
    	
    	// retorna o vetor resultante
    	return a;
    	
    }
    
    public static void main(String[] args) {
    	    	
    	Scanner in = new Scanner(System.in);
    	
        System.out.println("Informe a quantidade de elementos a serem inseridos:");
        int n = in.nextInt();
        
        System.out.println("Informe a quantidade de rotações:");
        int k = in.nextInt();
        
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
        	System.out.println("Informe o valor do elemento " + (a_i+1) + ":");
            a[a_i] = in.nextInt();
        }
              
        System.out.println("\nCalculando resultado...");
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
    
}
