package Day_20210826;

import java.util.*;
public class Solution_��ȭ��ȣ��� {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean check = solution(phone_book);
		
		System.out.println(check);

	}

	private static boolean solution(String[] phone_book) {
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0;i<phone_book.length;i++) {
			map.put(phone_book[i], i);
		}
		
		for(int i=0;i<phone_book.length;i++) {
			for(int j=1;j<phone_book[i].length();j++) {
				if(map.containsKey(phone_book[i].substring(0, j))) {
					return false;
				}
			}
		}
		
		return true;
	}

}
