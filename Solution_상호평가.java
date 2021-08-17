package Day_20210817;

import java.util.*;

public class Solution_상호평가 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scores = {{70, 49, 90}, {68, 50, 38}, {73, 31, 100}};
		String result = solution(scores);
		
		System.out.println(result);

	}

	private static String solution(int[][] scores) {
		// TODO Auto-generated method stub
		String answer = "";

		int len = scores.length;
		int[][] minMaxlist = new int[scores.length][2];
		
		for(int i=0;i<len;i++) {
			minMaxlist[i][0] = scores[i][i]; // 최저점
			minMaxlist[i][1] = scores[i][i]; // 최고점
			for(int j=0;j<len;j++){
				if(minMaxlist[i][0] > scores[j][i]) {
					minMaxlist[i][0] = scores[j][i];
				}
				if(minMaxlist[i][1] < scores[j][i]) {
					minMaxlist[i][1] = scores[j][i];
				}
			}
			
		}
		
		for(int i=0;i<len;i++) {
			int avg = 0, minCnt = 0, maxCnt = 0;
			if(minMaxlist[i][0] == scores[i][i]) {
				for(int j=0;j<len;j++) {
					if(minMaxlist[i][0] == scores[j][i]) {
						minCnt++;
					}
					avg += scores[j][i];
				}
			}else if(minMaxlist[i][1] == scores[i][i]) {
				for(int j=0;j<len;j++) {
					if(minMaxlist[i][1] == scores[j][i]) {
						maxCnt++;
					}
					avg += scores[j][i];
				}
			}else {
				for(int j=0;j<len;j++) {
					avg += scores[j][i];
				}
			}
			if(minCnt == 1) {
				avg = (avg - minMaxlist[i][0]) / (len - 1);
			}else if(maxCnt == 1) {
				avg = (avg - minMaxlist[i][1]) / (len - 1);
			}else {
				avg /= len;
			}
			
			if (avg >= 90) answer += "A"; 
			else if (avg >= 80) answer += "B"; 
			else if (avg >= 70) answer += "C"; 
			else if (avg >= 50) answer += "D"; 
			else answer += "F";
			
		}
			
		return answer;
	}

}
