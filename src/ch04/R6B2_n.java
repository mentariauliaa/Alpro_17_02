
package ch04;

public class R6B2_n {
    public static void main(String[] args) {
        int [] data = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        int sum = 0;
	int n = data.length-2;
	int j = 0;

	for (int num : data) {	
	sum = sum + num ;	
}
System.out.print(" Yaitu : ");
for (int i = 0; i < data.length ; i++ ) {	
if (i>n) {
System.out.print(data[i]+"");
}else{
System.out.print(data[i]+", ");
}

}
System.out.print("\n\n Dan Jumlah nya : "+sum);
}
}