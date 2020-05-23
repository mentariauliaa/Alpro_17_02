
package ch04;

public class R6B2_m {
    public static void main(String[] args) {
        int [] data = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        
        int z = 0;
	int jumlah,jumlah1 = 0;

	for (int i = 0; i < 12 ; i++ ) {	
	z=i+1;
	jumlah = data[i] - data[z];
	jumlah1=jumlah1+jumlah;
		}
		System.out.print("jumlah selisihnya adalah : "+jumlah1);
                
    }
}

