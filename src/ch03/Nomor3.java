
package ch03;
import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        int a = 3;
        int terkecil;
        
        Scanner x = new Scanner (System.in);
        int angka = x.nextInt();
        System.out.println("Masukkan angka = ");
        
        if (angka%a==0){
            terkecil=a;
            System.out.println(terkecil+ "Adalah bilangan pembagi dari "+ angka);
        }else{
            a=a+1;
            if(angka%a==0){
            terkecil=a;
            System.out.println(terkecil+ "Adalah bilangan pembagi dari "+ angka);
          
            }a++;
            
        }
    }
}
