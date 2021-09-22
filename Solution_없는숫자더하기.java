package Day_20210922;

public class Solution_없는숫자더하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {5,8,4,0,6,7,9};
		
		int result = solution(numbers);
		
		System.out.println(result);

	}

	private static int solution(int[] numbers) {
		// TODO Auto-generated method stub
		int answer = 0;
		
		int[] arr = new int[10];
		
		for(int i=0;i<numbers.length;i++) {
			arr[numbers[i]]++;
		}
		
		for(int i=0;i<10;i++) {
			if(arr[i] == 0) {
				answer += i;
			}
		}
		
		return answer;
	}

}
