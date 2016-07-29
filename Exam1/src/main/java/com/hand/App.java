package com.hand;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> list = new ArrayList<Integer>();
    	boolean bool = true;
    	int number = 0;
    	for (int i = 101; i < 200; i++) {
			for (int j = 2; j <= i / 2; j++) {
				if((i % j) == 0){
					bool = false;
					 break;
				}else{
					bool = true;
				}
			}
			if(bool){
				number ++;
				list.add(i);
			}
		}
    	System.out.print("101到200总共有：" + number + "个素数，分别为:");
    	Iterator<Integer> iterator = list.iterator();
    	while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + ",");
		}
    }
}
