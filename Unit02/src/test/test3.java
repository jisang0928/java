package test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("�� �Է�:");
		int month=sc.nextInt();
		int day;
		
		switch(month){
			case 2:
				day=28; break;
			case 4: case 6: case 9: case 11:
				day=30; break;
			default:
				day=31;
		}
		System.out.println(month+"���� "+day+"���Դϴ�.");
		

	}

}
