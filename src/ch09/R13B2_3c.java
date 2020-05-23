
package ch09;
import java.util.Arrays;

public class R13B2_3c {
    static int SieveOfSundaram(int n) { 

    int nNew = (n - 2) / 2; 
    boolean tanda[] = new boolean[nNew + 1]; 
  
    Arrays.fill(tanda, false); 
  
    for (int i = 1; i <= nNew; i++) 
    for (int j = i; (i + j + 2 * i * j) <= nNew; j++) 
        tanda[i + j + 2 * i * j] = true; 
  
    if (n > 2) 
    System.out.print(2 + " "); 
  
    for (int i = 1; i <= nNew; i++) 
    if (tanda[i] == false) 
        System.out.print(2 * i + 1 + " "); 
    return -1; 
} 
  
public static void main(String[] args) { 
    int n = 20; 
    SieveOfSundaram(n); 
} 
} 

