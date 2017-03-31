package logic_programs;

public class TestString {

	public static void main(String[] args) {

		String s1 = new String("Hello");
		String s2 = s1;
		String s3 = new String(s1);
		String s4 = new String("Hello");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));

	}

}
