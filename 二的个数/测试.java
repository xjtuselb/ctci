package 二的个数;

public class 测试 {
	public static void main(String[] args) {
		int n = 100;
		for (int i = 1; i <= n; i *= 10) {
			int p1 = (n / i + 7) / 10 * i;
			System.out.println(p1);
		}
	}
}
