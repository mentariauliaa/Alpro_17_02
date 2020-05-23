
package ch08;

public class R12B2_1c {
    public static void main(String[] args) {
			String str1="Teknik Informatika";
			String str2="Fakultas Teknik UIN";
			R12B2_1c lcsMain=new R12B2_1c();
			System.out.println("String 1: "+str1);
			System.out.println("String 2: "+str2);
			System.out.println("Longest common subString nya yaitu: " +lcsMain.getLongestCommonSubstring(str1, str2));
	
		}
		public String getLongestCommonSubstring(String str1, String str2){
			int m = str1.length();
			int n = str2.length();
	
			int max = 0;
	
			int[][] dp = new int[m][n];
			int endIndex=-1;
			for(int i=0; i<m; i++){
				for(int j=0; j<n; j++){
					if(str1.charAt(i) == str2.charAt(j)){
	
						if(i==0 || j==0){
							dp[i][j]=1;
						}else{
							dp[i][j] = dp[i-1][j-1]+1;
						}
	
						if(max < dp[i][j])
						{
							max = dp[i][j];
							endIndex=i;
						}
					}
	
				}
			}
			return str1.substring(endIndex-max+1,endIndex+1);
		}
	}

