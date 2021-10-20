package DB_Inc_2��;

public class Solution5 {

    public int solution(int[] arr) {
        
        int answer = 0;
        int count = 1;
        int first = arr[0];
        for(int i=1;i<arr.length;i++) {
        	// ���� ���ڰ� ���� ���ں��� ���� ���
        	if(first < arr[i]) {
        		count++;
        	}else {//���� ���ڰ� ���� ���ں��� ���ų� Ŭ ���
        		// ���� ���� �� ���̸� ��
        		answer = Math.max(answer, count);
        		// ���̴� �ٽ� 1�� �ʱ�ȭ
        		count = 1;
        	}
        	first = arr[i];
        }
        return answer;
    }

    
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 3, 4, 5};
        int ret = sol.solution(arr);

        // result
        System.out.println("Solution: return value of the method is " + ret + " .");
    }

}
