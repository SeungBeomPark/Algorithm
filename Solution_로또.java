package Day_20210726;

public class Solution_로또 {
	public static void main(String[] args) {
		int[] lottoes = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int[] result = solution(lottoes, win_nums);
		for(int k : result) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
	
	public static int[] solution(int[] lottoes, int[] win_nums) {
		int max_cnt = 0;
		int zero_cnt = 0;
		for(int i : lottoes) {
			for(int j : win_nums) {
				if(i == j) { // 구매번호와 당첨번호가 일치할때
					max_cnt++;
				}
			}
			if(i == 0) {// 구매번호에 0이 있을 때
				zero_cnt++;
			}
		}
		int up = (7 - (max_cnt + zero_cnt)) > 6 ? 6 : 7 - (max_cnt + zero_cnt);
		int down = (7 - max_cnt) > 6 ? 6 : (7 - max_cnt);
		
		int[] answer = {up, down};
		
		return answer;
	}

}
