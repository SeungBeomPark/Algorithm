package DB_Inc_2Â÷;

import java.util.*;

public class Solution4 {
	static int cnt;
    public int solution(int[] arr, int K) {
        
        int answer = 0;
        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		for(int k=j+1;k<arr.length;k++) {
        			int sum = arr[i] + arr[j] + arr[k];
        			if(sum % K == 0) {
        				answer++;
        			}
        		}
        	}
        }
        return answer;
    }
    
   
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;
        int ret = sol.solution(arr, K);


        
        System.out.println("Solution: return value of the method is " + ret + " .");
    }

}
