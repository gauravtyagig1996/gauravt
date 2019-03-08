package stringS;

public class StringB7 {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.capacity());
		s1.append("hello");
		System.out.println(s1.capacity());
		s1.append("java is a favourite language");
		System.out.println(s1.capacity());
		s1.ensureCapacity(10);
		System.out.println(s1.capacity());
		s1.ensureCapacity(50);
		System.out.println(s1.capacity());
	}

}
