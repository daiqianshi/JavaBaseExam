package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author shidaiqian
 *
 */
public class App {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, int[]> map = new HashMap<Integer, int[]>();
		// map.put(1, list2);
		// ��������
		System.out.print("�������ݣ�");
		for (int i = 0; i < 50; i++) {
			list.add((int) (Math.random() * 100));
			System.out.print(list.get(i) + " ");
		}
		//��������
		insert(list, map);
		//���
		System.out.println();
		System.out.println("����ǰ��");
		for (Integer integer : map.keySet()) {
			System.out.print(integer + "=>[");
			for (int i = 0; i < map.get(integer).length; i++) {
				System.out.print(map.get(integer)[i] + ",");
			}
			System.out.println("]");
		}
		//����
		sort(map);
		//���
		System.out.println("�����:");
		for (Integer integer : map.keySet()) {
			System.out.print(integer + "=>[");
			for (int i = 0; i < map.get(integer).length; i++) {
				System.out.print(map.get(integer)[i] + ",");
			}
			System.out.println("]");
		}
	}
	//�������ݺ���
	public static void insert(List<Integer> list, Map<Integer, int[]> map) {
		for (int i = 0; i < 10; i++) {
			int[] number = new int[50];
			int j = 0;
			Iterator<Integer> iterator = list.iterator();
			while (iterator.hasNext()) {
				Integer integer = (Integer) iterator.next();
				// System.out.print(integer + " ");
				if ((integer / 10) == i) {
					number[j] = integer;
					// System.out.print(number[j]);
					j++;
				}
			}
			int number1[] = new int[j];
			for (int j2 = 0; j2 < j; j2++) {
				number1[j2] = number[j2];
				// System.out.print(number1[j2] + " ");
			}
			map.put(i, number1);
		}
	}
	//	������
	public static void sort(Map<Integer, int[]> map) {
		for (Integer integer : map.keySet()) {
			for (int i = 0; i < map.get(integer).length; i++) {
				int max = map.get(integer)[i];
				int index = i;
				for (int j = i; j < map.get(integer).length; j++) {
					if (map.get(integer)[j] >= max) {
						max = map.get(integer)[j];
						index = j;
					}
				}
				int temp = map.get(integer)[i];
				map.get(integer)[i] = max;
				map.get(integer)[index] = temp;
			}
		}

	}
}
