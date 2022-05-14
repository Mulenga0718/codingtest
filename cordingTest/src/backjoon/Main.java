package backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		String m = sc.nextLine();
		m = m.toUpperCase();
		if (m.length() == 1) {
			System.out.println(m);
		} else {

			int count;
			for (int i = 0; i < 26; i++) {
				count = 0;
				for (int j = 0; j < m.length(); j++) {
					if (i + 65 == (int)(m.charAt(j)))
						count++;
				}
				list.add(i, count);
			}
			int max =0;
			for(int i = 0 ; i< list.size(); i ++) {
				if(list.get(i) > max ) max = list.get(i);
				
			}
			if(list.indexOf(max) != list.lastIndexOf(max)) {
				System.out.println("?");
				
			}else {
				System.out.println((char)(list.indexOf(max)+65));
			}
		}

	}
}
