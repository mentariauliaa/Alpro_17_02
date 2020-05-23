
package ch04;

public class R6B2_j {
    public static void main(String[] args) {
        int [] data = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        
        int z = 0;
	int arraynew;
        
        for (int i = 0; i < 12 ; i++ ) {	
            z=i+1;
            arraynew =data[i]-data[z];
	if (arraynew % 2 == 0) {
	System.out.print(arraynew+", ");
    }
}
    }
}
