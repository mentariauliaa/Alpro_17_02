
package ch03;
import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        int a = x.nextInt();
        System.out.println("Masukkan nilai x="+a);
        
        Scanner y = new Scanner (System.in);
        int b = y.nextInt();
        System.out.println("Masukkan nilai y="+b);
        
        if(a>b){
            System.out.println("Nilai yang tertinggi adalah "+a);
        }else{
            System.out.println("Nilai yang tertinggi adalah "+b);
                    
                    }
        }
    }
