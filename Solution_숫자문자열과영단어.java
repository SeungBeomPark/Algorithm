package Day_20210727;

public class Solution_숫자문자열과영단어 {
	public static void main(String[] args) {
		String str = "one4seveneight";
		int result = solution(str);
		System.out.println(result);
	}

	public static int solution(String s) {
		String[]  num = {"0","1","2","3","4","5","6","7","8","9"};
	    String[] word = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
	    for (int i = 0 ; i <10 ; i++){
	            s = s.replace(word[i] , num[i]);
	    }
	     return Integer.parseInt(s);
	}
}
