package Day_20210827;

import java.util.*;

public class Main_4641 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			ArrayList<Integer> list = new ArrayList<>();
			int first = sc.nextInt();
			int count = 0;
			if(first == -1) {
				break;
			}else {
				list.add(first);
				while(true) {
					int num = sc.nextInt();
					if(num == 0) {
						break;
					}else {
						list.add(num);
					}
					
				}
				for(int i=0;i<list.size();i++) {
					for(int j=0;j<list.size();j++) {
						if(list.get(j) == 2 * list.get(i)) {
							count++;
						}
					}
				}
				System.out.println(count);
			}
			
		}

	}

}
