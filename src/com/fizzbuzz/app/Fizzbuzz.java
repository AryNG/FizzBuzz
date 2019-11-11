package com.fizzbuzz.app;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {

	public static void main(String[] args) {
		
/*WHIT FOR*/	
		for (byte i=0; i<101; i++) {
		if (i%5!=0 && i%3!=0) {
			System.out.println(i);
		}
		else if(i%5==0 && i%3==0) {
			System.out.println(i+" FizzBuzz");
		}
		else if (i%5==0) {
			System.out.println(i+" Buzz");
		}
		else if(i%3==0) {
			System.out.println(i+" Fizz");
		}
	}
/*WITH WHILE*/
      int i=0;
		while(i<100) {
			if (i%5!=0 && i%3!=0) {
				System.out.println(i);
			}
			else if (i%5==0 && i%3==0) {
				System.out.println(i+" FizzBuzz");
			}
			else if (i%5==0) {
				System.out.println(i+" Buzz");
			}
			else if (i%3==0) {
				System.out.println(i+" Fizz");
			}
			i++;
		}
		
		
/*WITH ARRAYLIST */
		ArrayList <String> array = new ArrayList <String>();
		  for (byte i=0; i<101; i++) {
			if (i%5!=0 && i%3!=0) {
				array.add(String.valueOf(i));
			}
			else if(i%5==0 && i%3==0) {
				array.add("FizzBuzz");
			}
			else if (i%5==0) {
				array.add("Buzz");
			}
			else if(i%3==0) {
				array.add("fizz");
			}
		}	
			for(String result:array) {
				System.out.println(result);
		
			}
		
	}
}
