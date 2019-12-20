package tp_note_1;

import java.util.Scanner;

	public class Task5 {
		public static void main (String[] args) {
			Scanner sc = new  Scanner (System.in);
			int r;
			System.out.println("Program for converting money in Riels to Dollars.\r\n" + 
					"Conversion rate is: 1 USD = 4000 RIELS");
			System.out.print("Please input money in Riels: ");
			r = Integer.parseInt(sc.nextLine());
			int D= r/4000; 
			System.out.print(+r+" REILS = "+D+" DOLLARS");
	}
}
