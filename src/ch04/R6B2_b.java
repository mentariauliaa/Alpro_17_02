
package ch04;
import java.util.Scanner;

public class R6B2_b {
    public static void main(String[] args) {
        int [] data = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        
        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan angka yang ingin dicari = ");
        int cari = x.nextInt();
        for(int i=0; i<data.length; i++){
            if(data[i] == cari){
                System.out.println("Data " + cari + " Ditemukan di indeks " + i);
                break;
            }
        }
    }
   
}
