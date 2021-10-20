package DB_Inc_2차;

public class Solution5 {

    public int solution(int[] arr) {
        
        int answer = 0;
        int count = 1;
        int first = arr[0];
        for(int i=1;i<arr.length;i++) {
        	// 직전 숫자가 현재 숫자보다 작을 경우
        	if(first < arr[i]) {
        		count++;
        	}else {//직전 숫자가 현재 숫자보다 같거나 클 경우
        		// 현재 가장 긴 길이를 비교
        		answer = Math.max(answer, count);
        		// 길이는 다시 1로 초기화
        		count = 1;
        	}
        	first = arr[i];
        }
        return answer;
    }

    
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 3, 4, 5};
        int ret = sol.solution(arr);

        // result
        System.out.println("Solution: return value of the method is " + ret + " .");
    }

}
