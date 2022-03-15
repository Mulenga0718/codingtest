package codingTest02;

import java.util.Random;

public class Test01 {
	
	public static void main(String[] args) {
	
		Random ran = new Random();
		
		int size = ran.nextInt(100)+1;
		int move = ran.nextInt(100)+1;
		String map[][] = new String[size][size];
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				map[i][j]= (i+1)+","+(j+1);
			}
		}
		System.out.println("map크기: "+ size);
		System.out.println("움직임: "+ move);
		String way[] = new String[move];
		int count=0;
		int i=0;
		int j=0;
		while(count<move) {
			
			int ranway = ran.nextInt(4)+1;
			switch(ranway) {
			case 1:
				if(i<1) {
					break;}
				else {
					way[count] = "U"; i--; count++; break;
				}
			case 2: 
				if(i>map.length-1) {
					break;
				}else {
				way[count] = "D";  i++; count++; break;}
			case 3: 
				if(j>map.length-1) {
					break;
				}else {
				way[count] = "R";  j++; count++; break;}
			case 4: 
				if(j<1) {
					break;
				}else {
				way[count] = "L"; j--; count++; break;}
			}
			
		}
		for(String site: way) {
			System.out.print(site+" ");
		}
		System.out.println();
		
		System.out.println("위치: "+ map[i][j]);
		
		
	}
}
