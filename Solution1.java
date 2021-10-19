package DB_Inc_1차;

import java.util.*;

public class Solution1 {
	public long solution(long num) {
        // Write code here.
        long answer = 0;
        // 0을 1로 치환하기 위해 문자열로 변환
        String str = Long.toString(num+1);
        // 문자열에서 0을 1로 치환
        str = str.replace("0", "1");
        // 치환한 문자열을 다시 Long 타입 숫자로 변환
        answer = Long.parseLong(str);
        
        return answer;
    }
	public static void main(String[] args) {

        Solution1 sol = new Solution1();
        long num = 9923499;
        long ret = sol.solution(num);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");

	}


}
