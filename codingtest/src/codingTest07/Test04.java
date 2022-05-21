package codingTest07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test04 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int rest =v-a;
		int result = 0;
		if(rest %(a-b) == 0) {
			result = rest/(a-b);
		}else {
			result =  rest/(a-b)+1;
		}
		
		System.out.println(result+1);
	}
}
