package io.hexlet;

import org.apache.commons.lang3.StringUtils;

public class One {
	public static void main(String[] args) {
		Two.greeting();
		var str = "Hexlet";
		var rev = StringUtils.reverse(str);
		System.out.println(rev);
	}
}

