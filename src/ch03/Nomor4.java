
package ch03;
import java.util.Scanner;
public class Nomor4 {
    public static void main(String[] args) {
        boolean isBilanganPrima = true;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan bilangan" );
        int x=input.nextInt();
        
        for(int i=2;i<=x/2; i++){
            if (x%i==0){
                isBilanganPrima = false;
                break;
            }
        }
        if(isBilanganPrima){
            System.out.println(x+ "adalah bilangan prima");
        }else{
            System.out.println(x+ "Bukan termasuk bilangan prima");
        }
            
        }
    }
    

