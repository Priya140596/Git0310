package introduction;

import java.util.Scanner;

public class Day5Scanner {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	String name = sc.next();
	System.out.println("enter your age");
	byte age = sc.nextByte();
	System.out.println("enter your exact weight");	
	float weight = sc.nextFloat();
	System.out.println("enter your exact height");	
	double height = sc.nextDouble();
	System.out.println("enter your model num of system ");
	int model = sc.nextInt();
	System.out.println("enter if you are eligible to vote(enter true/false) ");
	boolean vote = sc.nextBoolean();
	System.out.println("enter your full name");
	
	sc.nextLine();
	String fname = sc.nextLine();
	System.out.println("enter your mobile num ");
	long mobnum = sc.nextLong();
	System.out.println("enter num of project mem ");
	short promem = sc.nextShort();
	System.out.println("enter your initial");
	char initial = sc.next().charAt(0);
	
	System.out.println("string -"+name+"byte"+age+"float"+weight+"double"+height+"int"+model+"boolean"+vote+"StringLine"+fname+"long"+mobnum+"short"+promem+"char"+initial);
	sc.toString();	
	}
}
