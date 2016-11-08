package 将正方形矩阵顺时针转动90度;

public class 将正方形矩阵顺时针转动90度 {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		print_2D_Array(mat);
		System.out.println();
		int[][] trMat = transformImage_2(mat, 3);
		print_2D_Array(trMat);
	}

	public static int[][] transformImage(int[][] mat, int n) {
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			// 上边界
			int last = n - 1 - layer;
			// 下边界
			for (int i = first; i < last; i++) {
				int top = mat[first][i];
				// 存储上边
				mat[first][i] = mat[n - 1 - i][first];
				// 左到上
				mat[n - 1 - i][first] = mat[last][n - 1 - i];
				// 下到左
				mat[last][n - 1 - i] = mat[i][last];
				// 右到下
				mat[i][last] = top;
				// 上到右
			}
		}
		return mat;
	}

	public int[][] transformImage_1(int[][] mat, int n) {
		int temp;
		for (int i = 0; i < n / 2; i++)
			for (int j = i; j < n - 1 - i; j++) {
				temp = mat[i][j];
				mat[i][j] = mat[n - j - 1][i];
				mat[n - j - 1][i] = mat[n - i - 1][n - j - 1];
				mat[n - i - 1][n - j - 1] = mat[j][n - i - 1];
				mat[j][n - i - 1] = temp;
			}
		return mat;
	}

	public static int[][] transformImage_2(int[][] mat, int n) {
		for (int i = 0; i < n / 2; i++)
			for (int j = i; j < n - 1 - i; j++) {
				mat[i][j] ^= mat[j][n - i - 1];
				mat[j][n - i - 1] ^= mat[i][j];
				mat[i][j] ^= mat[j][n - i - 1];

				mat[i][j] ^= mat[n - i - 1][n - j - 1];
				mat[n - i - 1][n - j - 1] ^= mat[i][j];
				mat[i][j] ^= mat[n - i - 1][n - j - 1];

				mat[i][j] ^= mat[n - j - 1][i];
				mat[n - j - 1][i] ^= mat[i][j];
				mat[i][j] ^= mat[n - j - 1][i];
			}
		return mat;
	}

	public static void print_2D_Array(int[][] a) {
		int m = a.length;
		int n = a[1].length;
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				if (j < n - 1)
					System.out.print(a[i][j] + " ");
				else
					System.out.println(a[i][j]);
	}

}
