package stringS;

public class StringB12 {
	int rollno;
	String name;
	String city;

	StringB12(int rollno, String name, String city) {
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public static void main(String args[]) {
		StringB12 s1 = new StringB12(102, "gaurav", "dholpur");
		StringB12 s2 = new StringB12(104, "saurav", "agra");

		System.out.println(s1);
		System.out.println(s2);
	}

}
