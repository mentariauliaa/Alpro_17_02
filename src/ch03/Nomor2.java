
package ch03;
import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        int a = x.nextInt();
        System.out.println("Masukkan nilai x="+a);
        
        Scanner y = new Scanner (System.in);
        int b = y.nextInt();
        System.out.println("Masukkan nilai y="+b);
        
        Scanner z = new Scanner (System.in);
        int c = z.nextInt();
        System.out.println("Masukkan nilai z="+z);
        
        if(a>b && a>c){
            System.out.println("Nilai yang tertinggi adalah "+a);
        }else if (b>a && b>c){
            System.out.println("Nilai yang tertinggi adalah "+b);
        }else{
            System.out.println("Nilai yang tertinggi adalah "+c);
                    
                    }
        }
    }


