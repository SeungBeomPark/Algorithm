package Day_20210827;

import java.util.*;
public class Main_2501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int result = solution(N, K);
		
		System.out.println(result);

	}

	private static int solution(int n, int k) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		int answer = 0;
		for(int i=1;i<=n;i++) {
			if(n % i == 0) {
				list.add(i);
			}
		}
		if(list.size() < k) {
			return 0;
		}
		Collections.sort(list);
		answer = list.get(k-1);
		return answer;
	}

}
