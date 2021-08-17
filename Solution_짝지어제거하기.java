package Day_20210817;

import java.util.*;

public class Solution_짝지어제거하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "baabaa";
		int result = solution(s);
		
		System.out.println(result);

	}
	
	public static int solution(String s) {
		Stack<Character> st = new Stack<>();
		for(int i=s.length()-1;i>=0;i--) {
			if(st.isEmpty()) {
				st.push(s.charAt(i));
			}else {
				char lastVal = st.peek();
				char curVal = s.charAt(i);
				if(lastVal == curVal) {
					st.pop();
				}else {
					st.push(curVal);
				}
			}
		}
		return st.size() == 0 ? 1 : 0;
	}

}
