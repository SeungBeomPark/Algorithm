package DB_Inc_1��;

import java.util.*;

public class Solution3 {

    public int solution(String pos) {
        // Write code here.
        int answer = 0;
        int r = pos.charAt(0) - 'A'; //x��ǥ
        int c = 8 - (pos.charAt(1) - '0'); //y��ǥ

        //��, �� �̵������� ��ġ
    	int[] dr = {-1, 1, 2, 2, 1, -1, -2, -2}; 
    	//��, �� �̵������� ��ġ
    	int[] dc = {-2, -2, -1, 1, 2, 2, 1, -1};
    	// 8������ ���鼭 �̵��������� üũ
    	for(int i=0;i<8;i++) {
    		int nr = r + dr[i];
    		int nc = c + dc[i];
    		//ü���� ���� ���� ����� ��
    		if(nr < 0 || nr >= 8 || nc < 0 || nc >= 8) {
    			continue;   
    		}
    		answer++;
    	}
          
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Solution3 sol = new Solution3();
        String pos = "A7";
        int ret = sol.solution(pos);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");


	}

}
