package 二的个数;

public class 二的个数 {

	public static void main(String[] args) {
		System.out.println(countNumberOf2s_2(123456));
		System.out.println(countNumberOf2s(123456));
	}

	public static int countNumberOf2s_1(int n) {
		int count = 0;
		for (int i = 0; i <= n; i++) {
			String s = String.valueOf(i);
			if (s.contains("2"))
				count += count2OfN(i);
		}
		return count;
	}

	public static int count2OfN(int n) {
		String s1 = String.valueOf(n);
		String s2 = s1.replaceAll("2", "");
		return s1.length() - s2.length();
	}

	public static int countNumberOf2s(int n) {
		int result = 0;
		int p1 = 0, p2 = 0;
		for (int i = 1; i <= n; i *= 10) {
			p1 = (n / i + 7) / 10 * i;
			p2 = ((n / i % 10 == 2) ? (n % i + 1) : 0);
			result += p1 + p2;
		}
		return result;
	}

	public static int countNumberOf2s_2(int n) {
		int count = 0;
		int low = 0;
		int high = 0;
		int cur = 0;
		int flag = 1;
		// n=123,flag=1000时就停止了
		while (n / flag != 0) {
			// n=12345,low=45,cur=3,high=12
			low = n - (n / flag) * flag;
			cur = (n / flag) % 10;
			high = n / (flag * 10);
			// count的递增规则
			if (cur < 2)
				count += high * flag;
			if (cur == 2)
				count += high * flag + low + 1;
			if (cur > 2)
				count += high * flag + flag;
			// 1,10,100,1000...
			flag *= 10;
		}
		return count;
	}
}
