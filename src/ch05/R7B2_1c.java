
package ch05;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class R7B2_1c {

  static final int EXTEUCLID_RET_ARARY_SIZE =  3;
  static final int INDEX_GCD = 0;
  
  static int gcd (int a,int b){
      int A =a;     int B=b;
      int q =0;     int r=0;
      
  while (B!= 0){
      q=A/B;
      r=A- q*B;
      A=B;
      B=r;
      
  }
  return A;
  
  }
    public static void main(String[] args) {
        int nilai1 =24;
        int nilai2 =18;
        System.out.println("FPB ("+nilai1+","+nilai2+") = "+ R7B2_1c.gcd (nilai1,nilai2));
    }
}


