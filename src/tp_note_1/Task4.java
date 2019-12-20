package tp_note_1;

import java.util.Scanner;

public class Task4 {


	public static void main (String[] args) {
		Scanner sc = new  Scanner (System.in);
		int h1,m1,s1,h2,m2,s2;
		System.out.println("Program for calculating cost of a call.");
		System.out.print("Please input start hours: ");
		h1 = Integer.parseInt(sc.nextLine());
		System.out.print("Please input start minutes: ");
		m1 = Integer.parseInt(sc.nextLine());
		System.out.print("Please input start seconds: ");
		s1 = Integer.parseInt(sc.nextLine());
		System.out.print("Please input end minutes: ");
		h2 = Integer.parseInt(sc.nextLine());
		System.out.print("Please input end minutes: ");
		m2 = Integer.parseInt(sc.nextLine());
		System.out.print("Please input end seconds: ");
		s2 = Integer.parseInt(sc.nextLine());
		
		int sec1= h1*3600+(m1*60)+s1;
		int sec2= h2*3600+(m2*60)+s2;
		int s= (sec2-sec1);
		int h= s/60;
		int m= h%60;
		int s3= s%60;
		h=h/60;
		double sum= (double)s/60;
		double cost= sum*0.05;
		
		
		System.out.println("Total call duration: "+h+"h:"+m+"m:"+s3+"s");
		System.out.println("Total cost of this call:" +cost+ "$");
	}
}
