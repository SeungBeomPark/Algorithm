package Day_20210928;

public class Solution_이진변환반복 {

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
		int cnt1 = 0; // 제거되는 0의 개수
		int cnt2 = 0; // 이진 변환 횟수
		while(true) {
			if(s.equals("1")) {
				break;
			}
			String str = s;// 문자열을 임시 저장할 변수
			String tmp = ""; // 0 제거 후 길이를 이진문자열로 변환된 문자열 변수
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch == '0') {
					cnt1++;//제거된 0의 개수 증가
				}
			}
			str = str.replace("0", "");
			int len = str.length();// 0을 제거한 후 문자열의 길이
			while(len != 0) {
				tmp += Integer.toString(len % 2);
				len = len / 2;
			}
			s = tmp;// 0을 제거한 후 문자열길이를 이진법으로 변환한 문자열 저장
			cnt2++;// 이진변환 횟수 증가
		}
		
		answer[0] = cnt2;
		answer[1] = cnt1;
		
		return answer;
	}

}
