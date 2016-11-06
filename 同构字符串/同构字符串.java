package 同构字符串;

public class 同构字符串 {

	public static void main(String[] args) {
		System.out.println(checkSam("ABc", "cAB"));
	}

	public static boolean checkSam(String stringA, String stringB) {
		if (stringA.length() != stringB.length())
			return false;
		char[] ch1 = stringA.toCharArray();
		char[] ch2 = stringB.toCharArray();
		int[] flag = new int[256];
		for (int i = 0; i < ch1.length; i++)
			flag[ch1[i]]++;

		for (int i = 0; i < ch2.length; i++)
			if (flag[ch2[i]]-- < 0)
				return false;
		return true;
	}

}
