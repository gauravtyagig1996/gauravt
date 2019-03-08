package stringS;

import java.util.StringTokenizer;

public class StringB14 {
	public static void main(String[] args) {
		StringTokenizer s1 = new StringTokenizer("my name is khan");

		while (s1.hasMoreTokens()) {
			System.out.println(s1.nextToken());
		}
	}

}
