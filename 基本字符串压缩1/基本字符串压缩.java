package 基本字符串压缩1;

public class 基本字符串压缩 {

	public static void main(String[] args) {
		String s = "welcometonowcoderrrrr";
		System.out.println(fun(s));
		System.out.println(s.length());
		System.out.println(fun(s).length());
	}

	public static String fun(String s) {
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c.length - 1; i++) {
			int index = i;
			int times = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[j] == c[i]) {
					times++;
					index = j;
				} else
					break;
			}
			i = index;
			sb.append(String.valueOf(c[i])).append(times);
		}
		if (sb.toString().length() >= s.length())
			return s;
		return sb.toString();
	}

}
