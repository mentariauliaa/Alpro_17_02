
package ch06;

public class R10B2_5c {
    public static void main(String[] args) {
        int[] data = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        
        int i,j,N;
        N=6;
        
        for (i = 0; i < N; i++) {
              int min = data[i];
              int pos = i;
              for (j = i; j < N; j++) {
                   if (data[j] < min) {
                   min = data[j];
                   pos = j;
                }
              }

              if(i!=pos) {
                 int temp = data[i];
                 data[i] = data[pos];
                 data[pos] = temp;
               }
            }
        for(i=0; i<6; i++){ 
            System.out.print(data[i]+" ");
        }
    }
}