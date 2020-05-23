
package ch04;

public class R6B2_e {
    public static void main(String[] args) {
        int [] data = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int [] angka2 = {2,12,20,21,22,23,24,25,26,27,28,29,32,42,52,62,72,82,92,102};
        
        
        for(int i=0; i<data.length; i++){
            for(int  j=0; j<angka2.length; j++){
            if(data[i]==angka2[i]){
                System.out.print(data[i]);
            }
        }
    }
        }
}

