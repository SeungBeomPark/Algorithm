package Day_20210928;

public class Solution_������ȯ�ݺ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "1111111";
		int[] result = solution(s);
		
		for(int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
		

	}

	private static int[] solution(String s) {
		// TODO Auto-generated method stub
		int[] answer = new int[2];
		int cnt1 = 0; // ���ŵǴ� 0�� ����
		int cnt2 = 0; // ���� ��ȯ Ƚ��
		while(true) {
			if(s.equals("1")) {
				break;
			}
			String str = s;// ���ڿ��� �ӽ� ������ ����
			String tmp = ""; // 0 ���� �� ���̸� �������ڿ��� ��ȯ�� ���ڿ� ����
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch == '0') {
					cnt1++;//���ŵ� 0�� ���� ����
				}
			}
			str = str.replace("0", "");
			int len = str.length();// 0�� ������ �� ���ڿ��� ����
			while(len != 0) {
				tmp += Integer.toString(len % 2);
				len = len / 2;
			}
			s = tmp;// 0�� ������ �� ���ڿ����̸� ���������� ��ȯ�� ���ڿ� ����
			cnt2++;// ������ȯ Ƚ�� ����
		}
		
		answer[0] = cnt2;
		answer[1] = cnt1;
		
		return answer;
	}

}
