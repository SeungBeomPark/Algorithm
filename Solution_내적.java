package Day_20210726;
// ���α׷��ӽ� ��������
public class Solution_���� {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};// int�� �迭 ����
		int[] b = {-3, -1, 0, 2}; // int�� �迭 ����
		
		int result = solution(a, b);
		System.out.println(result);
	}
	
	public static int solution(int[] a, int[] b) {
		int answer = 0;
		//a�� b�� �迭���̴� ���Ƽ� �� �� �ƹ��ų� �����ص� �������
		for(int i=0;i<a.length;i++) {
			answer += a[i] * b[i];
		}
		return answer;
	}

}
