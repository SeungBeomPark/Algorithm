package DB_Inc_1��;

import java.util.*;

public class Solution1 {
	public long solution(long num) {
        // Write code here.
        long answer = 0;
        // 0�� 1�� ġȯ�ϱ� ���� ���ڿ��� ��ȯ
        String str = Long.toString(num+1);
        // ���ڿ����� 0�� 1�� ġȯ
        str = str.replace("0", "1");
        // ġȯ�� ���ڿ��� �ٽ� Long Ÿ�� ���ڷ� ��ȯ
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
