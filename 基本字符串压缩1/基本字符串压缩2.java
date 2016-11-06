package 基本字符串压缩1;

public class 基本字符串压缩2 {

	public static void main(String[] args) {
		System.out.println(fun("abcccdgtewwaaaaaa"));
	}

	public static String fun(String s) {
		char[] cha = s.toCharArray();
		String res = "";
		int count = 1;
		for (int i = 1; i < cha.length; i++) {
			if (cha[i] != cha[i - 1]) {
				res += String.valueOf(cha[i - 1]) + count;
				count = 1;
			} else {
				count++;
			}
		}
		res += String.valueOf(cha[cha.length - 1]) + count;
		return res;
	}

}
