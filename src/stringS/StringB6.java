package stringS;

public class StringB6 {
  public static void main(String[] args) {
	StringBuffer s1=new StringBuffer();
	System.out.println(s1.capacity()); //default capicity 16
	s1.append("java");
	System.out.println(s1.capacity());//naw 16
	s1.append("java is faverate language");
	System.out.println(s1.capacity());
}

}
