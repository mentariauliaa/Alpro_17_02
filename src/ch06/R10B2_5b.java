
package ch06;

public class R10B2_5b {
    public static void main(String[] args) {

        int[] data = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int i,j,data_sisip;
        
        for(i=1; i<6; i++){ 
            data_sisip = data[i]; 
            j = i; 
            while((j>0) && (data[j-1] > data_sisip)){            
                data[j] = data[j-1]; 
                j = j - 1; 
            }        
            data[j] = data_sisip; 
        } 
        for(i=0; i<6; i++){ 
            System.out.print(data[i]+" ");
        }
    }
}

