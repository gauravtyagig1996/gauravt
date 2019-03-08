package stringS;

public class StringB9 {
	public static String concatWithString() {

		String t = "java";

		for (int i = 0; i < 10000; i++) {

			t = t + "Tpoint";

		}

		return t;
	}

	public static String concatWithStringBuffer() {

		StringBuffer sb = new StringBuffer("java");
		{

			for (int i = 0; i < 10000; i++) {

				sb.append("Tpoint");
			}
			return sb.toString();

		}
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("time taking by concating with string" + " " + (System.currentTimeMillis() - startTime) + " " + "ms");
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out
				.println("time taking byconcating with stringbuffer" + " " + (System.currentTimeMillis() - startTime) + " "+"ms");

	}

}