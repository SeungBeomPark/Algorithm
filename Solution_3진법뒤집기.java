package Day_20210928;

import java.util.*;

public class Solution_3���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 45;
		int result = solution(n);
		
		System.out.println(result);

	}

	private static int solution(int n) {
		// TODO Auto-generated method stub
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();// 3�������� �� ���� �����ϱ� ���� ����Ʈ
		while(n != 0) {
			// n�� 3���� ���� ����, �� ���� ����Ʈ�� �߰��ϰ� �ݺ��� Ż��
			if(n < 3) {
				list.add(n);
				break;
			}
			//3���� ���� �������� ����Ʈ�� �߰��ϰ�, n�� 3���� ������.
			list.add(n % 3);
			n = n/3;
		}
		//3�������� ��Ÿ�� ���� 10�������� ��ȯ
		for(int i=0;i<list.size();i++) {
			answer += (Math.pow(3, list.size()-i-1) * list.get(i));
		}
		
		return answer;
	}

}
