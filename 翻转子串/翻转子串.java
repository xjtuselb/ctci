package 翻转子串;

public class 翻转子串 {
	public static void main(String[] args) {
		String s1 = "Hello world";
		String s2 = "worldhello ";
		System.out.println(checkReverseEqual(s1, s2));
	}

	public static boolean checkReverseEqual(String s1, String s2) {
		if (s1.equals(s2))
			return true;
		for (int i = 1; i < s1.length(); i++) {
			String sub1 = s1.substring(0, i);
			String sub2 = s1.substring(i);
			if ((sub2 + sub1).equals(s2))
				return true;
		}
		return false;
	}
}
