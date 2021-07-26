package Day_20210726;

public class Solution_�ζ� {
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
				if(i == j) { // ���Ź�ȣ�� ��÷��ȣ�� ��ġ�Ҷ�
					max_cnt++;
				}
			}
			if(i == 0) {// ���Ź�ȣ�� 0�� ���� ��
				zero_cnt++;
			}
		}
		int up = (7 - (max_cnt + zero_cnt)) > 6 ? 6 : 7 - (max_cnt + zero_cnt);
		int down = (7 - max_cnt) > 6 ? 6 : (7 - max_cnt);
		
		int[] answer = {up, down};
		
		return answer;
	}

}
