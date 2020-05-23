
package ch05;

public class R7B2_2c {
    public static void main(String[] args) {
        int[] arr = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        
        int[] result = findMaxSumIndex(arr);
        System.out.println("index awal  = "+ result[0]);
        System.out.println("index akhir = "+ result[1]);
        System.out.println("Sum         = "+ result[2]);
    }

    private static int[] findMaxSumIndex(int[] arr) {
    int[] result = new int [3];
    int maxSumTillNow = Integer.MIN_VALUE;
    
    int tempStartIndex = 0;
    int tempSum = 0;
    
    for (int i = 0;i<arr.length; i++){
        tempSum = tempSum = arr[i];
        result[0] = tempStartIndex;
        result[1] = i;
        result[2] = maxSumTillNow;
    
        
    if (tempSum<0){
        tempSum=0;
        tempStartIndex =i+1;      
    }        
    }
    return result;
}
}

