
package ch08;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class R12B2_2c {
      public void temukanPola(String t, String p)
    {
        char[] text = t.toCharArray();
        char[] pola = p.toCharArray();
        int pos = indexOf(text, pola);
        if (pos == -1)
            System.out.println("\nNo Match\n");
        else
            System.out.println("Pola ditemukan pada : "+ pos);
    }

    public int indexOf(char[] text, char[] pola) 
    {
        if (pola.length == 0) 
            return 0;
        int charTable[] = makeCharTable(pola);
        int offsetTable[] = makeOffsetTable(pola);
        for (int i = pola.length - 1, j; i < text.length;) 
        {
            for (j = pola.length - 1; pola[j] == text[i]; --i, --j) 
                     if (j == 0) 
                    return i;
 
              i += Math.max(offsetTable[pola.length - 1 - j], charTable[text[i]]);
        }
        return -1;
      }
      private int[] makeCharTable(char[] pola) 
      {
        final int ALPHABET = 256;
        int[] table = new int[ALPHABET];
        for (int i = 0; i < table.length; ++i) 
               table[i] = pola.length;
        for (int i = 0; i < pola.length - 1; ++i) 
               table[pola[i]] = pola.length - 1 - i;
        return table;
      }
      private static int[] makeOffsetTable(char[] pola) 
      {
        int[] table = new int[pola.length];
        int PosisiAwalanTerakhir = pola.length;
        for (int i = pola.length - 1; i >= 0; --i) 
        {
            if (isPrefix(pola, i + 1)) 
                   PosisiAwalanTerakhir = i + 1;
              table[pola.length - 1 - i] = PosisiAwalanTerakhir- i + pola.length - 1;
        }
        for (int i = 0; i < pola.length - 1; ++i) 
        {
              int slen = suffixLength(pola, i);
              table[slen] = pola.length - 1 - i + slen;
        }
        return table;
    }
    private static boolean isPrefix(char[] pola, int p) 
    {
        for (int i = p, j = 0; i < pola.length; ++i, ++j) 
            if (pola[i] != pola[j]) 
                  return false;
        return true;
    }
    private static int suffixLength(char[] pola, int p) 
    {
        int len = 0;
        for (int i = p, j = pola.length - 1; i >= 0 && pola[i] == pola[j]; --i, --j) 
               len += 1;
        return len;
    }
    public static void main(String[] args) throws IOException
    {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Algoritma Boyer Moore\n");
        System.out.println("\nMasukkan teks\n");
        String text = br.readLine();
        System.out.println("\nMasukkan pola\n");
        String pola = br.readLine();
        R12B2_2c bm = new R12B2_2c(); 
        bm.temukanPola(text, pola);     
    }
}

