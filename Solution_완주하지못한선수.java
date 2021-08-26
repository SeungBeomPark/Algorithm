package Day_20210826;

import java.util.*;

public class Solution_완주하지못한선수 {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"}; // 참가자 배열
		String[] completion = {"eden", "kiki"}; // 완주자 배열
		
		String result = solution(participant, completion);
		
		System.out.println(result);	
	}

	private static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0;i<completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
				
			}
		}
		
		return participant[participant.length-1];
	}
	
}
