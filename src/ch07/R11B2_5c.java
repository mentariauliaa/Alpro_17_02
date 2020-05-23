
package ch07;
import java.util.Arrays;
public class R11B2_5c {
     void cocktailSort(int data[])
    {
	  boolean swapped;
	  do {
		swapped = false;
		for (int i =0; i<= data.length  - 2;i++) {
			if (data[ i ] > data[ i + 1 ]) {
				int temp = data[i];
				data[i] = data[i+1];
				data[i+1]=temp;
				swapped = true;
			}
		}
		if (!swapped) {
			break;
		}
		swapped = false;
		for (int i= data.length - 2;i>=0;i--) {
			if (data[ i ] > data[ i + 1 ]) {
				int temp = data[i];
				data[i] = data[i+1];
				data[i+1]=temp;
				swapped = true;
			}
		}
	} while (swapped);
}

    public static void main(String args[])
    {
        R11B2_5c ob = new R11B2_5c();
        int data[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        System.out.println("Array Sebelum diurutkan:");
        System.out.println(Arrays.toString(data));
        ob.cocktailSort(data);
        System.out.println("Array setelah diurutkan");
        System.out.println(Arrays.toString(data));
    }
}

