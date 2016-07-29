package com.hand;

import java.util.Scanner;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入日期：");
		String dateString = scanner.next();
		String yearString = dateString.substring(0, 4);
		String monthString = dateString.substring(5, 7);
		String dayString = dateString.substring(8, 10);
		System.out.println(yearString + " " + monthString + " " + dayString);
		int days = 0;
		int year = Integer.parseInt(yearString);
		int month = Integer.parseInt(monthString);
		int day = Integer.parseInt(dayString);
		int number[] = new int[12];

		for (int i = 0; i < number.length; i++) {
			if (i == 3 || 1 == 5 || i == 8 || i == 10) {
				number[i] = 30;
			} else if (i == 1) {
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					number[i] = 29;
				} else {
					number[i] = 28;
				}

			} else {
				number[i] = 31;
			}
		}
		if (month != 1) {
			for (int i = 0; i < month - 1; i++) {
				days += number[i];
			}
			days += day;
		} else {
			days = day;
		}

		System.out.println("你输入的日期为当年的第 " + days + " 天");

	}
}
