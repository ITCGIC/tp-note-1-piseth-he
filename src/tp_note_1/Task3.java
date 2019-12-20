package tp_note_1;

import java.util.Scanner;

public class Task3 {
	public static void main (String[] args) {
		Scanner sc = new  Scanner (System.in);
		int h, m, s;
		System.out.println("Program for converting time to seconds.");
		System.out.print("Please input hours: ");
		h = Integer.parseInt(sc.nextLine());
		System.out.print("Please input minutes: "); 
		m = Integer.parseInt(sc.nextLine());
		System.out.print("Please input seconds: "); 
		s = Integer.parseInt(sc.nextLine());
		
		int sec= h*3600+(m*60)+s;
		
		System.out.print("Number of seconds = "+sec );
	}

}
