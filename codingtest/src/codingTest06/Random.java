package codingTest06;

import java.util.ArrayList;
import java.util.Collections;

public class Random {

	public static void main(String[] args) {
		Random ran = new Random();
		ArrayList<Integer> random = new ArrayList<Integer>();
		random.add(1);
		random.add(2);
		random.add(3);
		random.add(4);
		
		Collections.shuffle(random);
			
		System.out.println(random);
	}

}
