package 清除行列;

import java.util.HashSet;

public class 清除行列 {

	public static void main(String[] args) {

	}

	public static int[][] clearZero(int[][] mat, int n) {
		HashSet<Integer> x = new HashSet<Integer>();
		HashSet<Integer> y = new HashSet<Integer>();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 0) {
					x.add(i);
					y.add(j);
				}
			}
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				if (x.contains(i) || y.contains(j))
					mat[i][j] = 0;
			}
		return mat;
	}
}
