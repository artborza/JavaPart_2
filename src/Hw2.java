
public class Hw2 {

	public static void main(String[] agrs) {
		String string1 = "You and Me";
		String string2 = " you and me ";
		System.out.println(string1.equals(string2));
		System.out.println(string1.contains(string2));
		System.out.println(string1.length());
		System.out.println(string2.length());
		System.out.println(string1.substring(0, 4));
		System.out.println(string2.substring(0, 4));
		System.out.println(string2.trim());
		System.out.println(string2.toUpperCase());
		System.out.println(string2.trim().toUpperCase());
	}
}
