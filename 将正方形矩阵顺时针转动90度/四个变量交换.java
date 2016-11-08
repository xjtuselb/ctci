package 将正方形矩阵顺时针转动90度;

public class 四个变量交换 {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3, d = 4;

		a ^= d;
		d ^= a;
		a ^= d;

		a ^= c;
		c ^= a;
		a ^= c;

		a ^= b;
		b ^= a;
		a ^= b;

		System.out.println(a + " " + b + " " + c + " " + d);
	}

	public static void swap(int a, int b) {
		a ^= b;
		b ^= a;
		a ^= b;
	}

}
