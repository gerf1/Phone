package com.codingdojo;

public class PhoneTester {

		public static void main(String[] args) {
			Galaxy s10 = new Galaxy("S10", 97, "AT&T", "Raang Raang!");
			Iphone iPhoneX = new Iphone("X", 100, "T-Mobile", "Ring ring ring!");
			
			s10.displayInfo(); 
			System.out.println(s10.ring());
			System.out.println(s10.unlock());
			
			iPhoneX.displayInfo();
			System.out.println(iPhoneX.ring());
			System.out.println(iPhoneX.unlock());
		}

	}


