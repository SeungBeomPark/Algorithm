package Day_20210830;

import java.util.*;

public class Main_5555 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int N = sc.nextInt();
		int count = 0;
		
		for(int i=1;i<=N;i++) {
			String s = sc.next();
			s += s;
			
			if(s.contains(str)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
