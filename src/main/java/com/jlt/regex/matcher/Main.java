package com.jlt.regex.matcher;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		String regex1 = "[abc]";
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher("b");
		System.out.println("Matcher 1 : "+matcher1.matches());
		
		String regex2 = "[^abc]";
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher("c");
		System.out.println("Matcher 2 : "+matcher2.matches());
		
		String regex3 = "[a-zA-Z0-9]";
		Pattern pattern3 = Pattern.compile(regex3);
		Matcher matcher3 = pattern3.matcher("T");
		System.out.println("Matcher 3 : "+matcher3.matches());
		
		String regex4 = "[abc]*";
		Pattern pattern4 = Pattern.compile(regex4);
		Matcher matcher4 = pattern4.matcher("abc");
		System.out.println("Matcher 4 : "+matcher4.matches());
		
		String regex5 = "[abc[xyz]]*";
		Pattern pattern5 = Pattern.compile(regex5);
		Matcher matcher5 = pattern5.matcher("za");
		System.out.println("Matcher 5 : "+matcher5.matches());
		
		String regex6 = "[abc&&[cde]]";
		Pattern pattern6 = Pattern.compile(regex6);
		Matcher matcher6 = pattern6.matcher("c");
		System.out.println("Matcher 6 : "+matcher6.matches());
		
		String regex7 = "[a-d&&[^c-f]]";
		Pattern pattern7 = Pattern.compile(regex7);
		Matcher matcher7 = pattern7.matcher("b");
		System.out.println("Matcher 7 : "+matcher7.matches());
		
		String regex8 = "[abc]+";
		Pattern pattern8 = Pattern.compile(regex8);
		Matcher matcher8 = pattern8.matcher("abbc");
		System.out.println("Matcher 8 : "+matcher8.matches());
		
		String regex9 = "[abc]?";
		Pattern pattern9 = Pattern.compile(regex9);
		Matcher matcher9 = pattern9.matcher("");
		System.out.println("Matcher 9 : "+matcher9.matches());
		
		String regex10 = "[abc]*";
		Pattern pattern10 = Pattern.compile(regex10);
		Matcher matcher10 = pattern10.matcher("abccabbc");
		System.out.println("Matcher 10 : "+matcher10.matches());
		
		String regex11 = "[abc]{2}";
		Pattern pattern11 = Pattern.compile(regex11);
		Matcher matcher11 = pattern11.matcher("ac");
		System.out.println("Matcher 11 : "+matcher11.matches());
		
		String regex12 = "[abc]{2,5}";
		Pattern pattern12 = Pattern.compile(regex12);
		Matcher matcher12 = pattern12.matcher("abbccaa");
		System.out.println("Matcher 12 : "+matcher12.matches());
		
		String regex13 = "[a-c]{3,}";
		Pattern pattern13 = Pattern.compile(regex13);
		Matcher matcher13 = pattern13.matcher("abbcccabbcbcaaa");
		System.out.println("Matcher 13 : "+matcher13.matches());
		
		String regex14 = ".";
		Pattern pattern14 = Pattern.compile(regex14);
		Matcher matcher14 = pattern14.matcher("k");
		System.out.println("Matcher 14 : "+matcher14.matches());
		
		String regex15 = ".+";
		Pattern pattern15 = Pattern.compile(regex15);
		Matcher matcher15 = pattern15.matcher("avdfggdjflkdfj");
		System.out.println("Matcher 15 : "+matcher15.matches());
		
		String regex16 = ".*";
		Pattern pattern16 = Pattern.compile(regex16);
		Matcher matcher16 = pattern16.matcher("");
		System.out.println("Matcher 16 : "+matcher16.matches());
		
		String regex17 = "\\d+";
		Pattern pattern17 = Pattern.compile(regex17);
		Matcher matcher17 = pattern17.matcher("30578934");
		System.out.println("Matcher 17 : "+matcher17.matches());
		
		String regex18 = "^(\\d*)(\\.)(\\d+)$";
		Pattern pattern18 = Pattern.compile(regex18);
		Matcher matcher18 = pattern18.matcher("3.14");
		System.out.println("Matcher 18 : "+matcher18.matches());
		
		String regex19 = "^([a-z0-9&&[^!@#\\$%\\^&\\*\\(\\)]]+)@(.+)$";
		Pattern pattern19 = Pattern.compile(regex19);
		Matcher matcher19 = pattern19.matcher("khun123@gmail.com");
		System.out.println("Matcher 19 : "+matcher19.matches());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String regex = scanner.nextLine();
		scanner.close();
		String text = "This is google. We can fine anything on google.";
		Pattern pattern = Pattern.compile(regex.toLowerCase());
		Matcher matcher = pattern.matcher(text.toLowerCase());
		boolean found = false;
		while(matcher.find()) {
			System.out.println(regex+" is found at "+matcher.start()+" to "+matcher.end());
			found = true;
		}
		
		if(!found) {
			System.out.println(regex+" is not found.");
		}
		
	}

}






