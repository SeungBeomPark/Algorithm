package Day_20210828;

import java.util.*;

public class Main_1032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		int size = 0;
		for(int i=1;i<=N;i++) {
			String str = sc.next();
			size = str.length();
			list.add(str);
		}

		
		ArrayList<Character> result = new ArrayList<>();
		for(int i=0;i<size;i++) {
			boolean check = true;
			ArrayList<Character> ch_list = new ArrayList<>();
			
			for(int j=0;j<list.size();j++) {
				char ch = list.get(j).charAt(i);
				ch_list.add(ch);
			}
			char first = ch_list.get(0);
			for(char c : ch_list) {
				if(first != c) {
					check = false;
					break;
				}
			}
			if(check) {
				result.add(first);
			}else {
				result.add('?');
			}
			
			
			
		}
		for(char ch : result) {
			System.out.print(ch);
		}
		System.out.println();
		
		

	}

}
