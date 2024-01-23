package com.edubridge.selectionstatement;
import java.util.Scanner;
public class SwitchSatementDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int map_no=s.nextInt();
		switch(map_no) {
		case 1:
			System.out.println("Wlcome to miramar");
			break;
		case 2:
			System.out.println("Wlcome to sanhok");
			break;
		case 3:
			System.out.println("Wlcome to vikendi");
			break;
		case 4:
			System.out.println("Wlcome to sosty");
			break;
		default:
			System.out.println("invalid map no");
		}

	}

}
