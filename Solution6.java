package DB_Inc_2��;

import java.util.*;

public class Solution6 {
	public int[] solution(String commands) {
        
        int[] answer = new int[2];
        // 'L'�� x�� �������� -1��ŭ, 'R'�� x�� �������� +1��ŭ, 'U'�� y�� �������� +1��ŭ, 'D'�� y�� �������� -1 ��ŭ �̵�
        for(int i=0;i<commands.length();i++) {
        	char ch = commands.charAt(i);
        	switch(ch) {
        	case 'L':
        		answer[0] -= 1;
        		break;
        	case 'R':
        		answer[0] += 1;
        		break;
        	case 'U':
        		answer[1] += 1;
        		break;
        	case 'D':
        		answer[1] -= 1;
        		break;
        	}
        }
        return answer;
    }

    
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret)  + " .");
    }

}
