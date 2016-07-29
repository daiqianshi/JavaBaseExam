package com.hand;

import java.util.Scanner;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = 0;
		System.out.print("请输入工资：");
		int sal = scanner.nextInt();
		start = sal - 3500;
		double money = 0;
		if (start < 1500) {
			money = start * 0.03;
		} else if (start >= 1500 && start < 4500) {
			money = start * 0.1;
		} else if (start >= 4500 && start < 9000) {
			money = start * 0.2;
		} else if (start >= 9000 && start < 35000) {
			money = start * 0.25;
		} else if (start >= 35000 && start < 55000) {
			money = start * 0.3;
		} else if (start >= 55000 && start < 80000) {
			money = start * 0.35;
		}else if (start >= 80000) {
			money = start * 0.45;
		}
		System.out.println("所需要缴纳的税费为：" + money);

	}

}
