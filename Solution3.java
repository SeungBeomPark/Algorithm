package DB_Inc_1차;

import java.util.*;

public class Solution3 {

    public int solution(String pos) {
        // Write code here.
        int answer = 0;
        int r = pos.charAt(0) - 'A'; //x좌표
        int c = 8 - (pos.charAt(1) - '0'); //y좌표

        //좌, 우 이동가능한 위치
    	int[] dr = {-1, 1, 2, 2, 1, -1, -2, -2}; 
    	//상, 하 이동가능한 위치
    	int[] dc = {-2, -2, -1, 1, 2, 2, 1, -1};
    	// 8방향을 돌면서 이동가능한지 체크
    	for(int i=0;i<8;i++) {
    		int nr = r + dr[i];
    		int nc = c + dc[i];
    		//체스판 범위 밖을 벗어났을 때
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
