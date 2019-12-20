package tp_note_1;

import java.util.Scanner;

public class Task2 {
	public static void main (String[] args) {
		Scanner sc = new  Scanner (System.in);
		int s;
		System.out.println("Program for converting seconds into formated H:M:S");
		System.out.println("Input number of seconds: ");
		s = Integer.parseInt(sc.nextLine());
		int h= s/60;
		int m= h%60;
		int s1= s%60;
		h=h/60;
				
		System.out.println("Time corresponding to "+s+ " is"+h+":"+m+":"+s1);
	}

}
