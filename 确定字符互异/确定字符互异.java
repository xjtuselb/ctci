package 确定字符互异;

public class 确定字符互异 {

	public static void main(String[] args) {
		System.out.println(checkDifferent("D-5H0F6T%Z?QM9,\72:[A8X! ;YJ#"));
		System.out.println(checkDifferent("fbcdbea"));
	}

	public static boolean checkDifferent(String iniString) {
		for (int i = 0; i < iniString.length(); i++)
			for (int j = i + 1; j < iniString.length(); j++)
				if ((iniString.charAt(i) ^ iniString.charAt(j)) == 0)
					return false;
		return true;
	}
}
