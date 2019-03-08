package stringS;

public class StringB10 {
	public static void main(String[] args) {
		System.out.println("hashcode test of string");

		String str = "java";
		System.out.println(str.hashCode());
		str = str + "tpoint";
		System.out.println(str.hashCode());

		System.out.println("hashcode test of stringbuffer");
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb.hashCode());
		sb.append("tpoint");
		System.out.println(sb.hashCode());

	}

}
