

package ch08;
import java.util.Scanner;
public class R12B2_3c {
    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    String cari = x.next();
    String target = x.next();
    int result = KMP(cari, target);
    if (result == -1) {
      System.out.println("Tidak");
    }
      else {
        System.out.println("Ya");
      }
  }

  public static int KMP(String cari, String target) {
    int[] failureTable = failureTable(target);

    int targetPointer = 0; 
    int cariPointer = 0; 

    while (cariPointer < cari.length()) { 
      if (cari.charAt(cariPointer) == target.charAt(targetPointer)) { 
        targetPointer++;
        if (targetPointer == target.length()) { 
          int x = target.length() + 1;
          return cariPointer - x; 
        }
        cariPointer++; 
      } else if (targetPointer > 0) { // case 2
        targetPointer = failureTable[targetPointer];
      } else { 
        cariPointer++;
      }
    }
    return -1;
  }
  public static int[] failureTable(String target) {
    int[] table = new int[target.length() + 1];
    table[0] = -1;
    table[1] = 0;

    int kiri = 0;
    int kanan = 2;

    while (kanan < table.length) { 
      if (target.charAt(kanan - 1) == target.charAt(kiri)) {
        kiri++;
        table[kanan] = kiri;
        kanan++;
      }  else if (kiri > 0) { 
        kiri = table[kiri];
      } else {
          table[kanan] = kiri;
          kanan++;
      }
    }
    return table;
  }

}

