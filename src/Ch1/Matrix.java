package Ch1;

/**
 * 矩阵 1.1.33
 */
public class Matrix {
    /**
     * 向量点乘
     *
     * @param x
     * @param y
     * @return
     */
    public static double dot(double[] x, double[] y) {
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            if (i < y.length)
                result += (x[i] * y[i]);
        }
        return result;
    }

    /**
     * 矩阵相乘
     *
     * @param a
     * @param b
     * @return
     */
    public static double[][] mult(double[][] a, double[][] b) {
        if (a[0].length != b.length) return new double[][] {{0}};
        int M = a.length;
        int N = b[0].length;
        int K = b.length;
        double[][] result = new double[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < K; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    /**
     * 矩阵转置
     *
     * @param a
     * @return
     */
    public static double[][] transpose(double[][] a) {
        int M = a[0].length;
        int N = a.length;
        double[][] result = new double[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = a[j][i];
            }
        }
        return result;
    }

    /**
     * 矩阵和向量相乘
     *
     * @param a
     * @param x
     * @return
     */
    public static double[] mult(double[][] a, double[] x) {
        if (a[0].length != x.length) return new double[] {0};
        int M = a.length;
        int N = a[0].length;
        double[] result = new double[N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                result[j] += a[i][j] * x[j];
            }
        }
        return result;
    }

    /**
     * 向量和矩阵相乘
     *
     * @param x
     * @param a
     * @return
     */
    public static double[] mult(double[] x, double[][] a) {
        if (x.length != a.length) return  new double[] {0};
        int M = a.length;
        int N = a[0].length;
        double[] result = new double[M];

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                    result[i] += a[i][j] * x[i];
            }
        }
        return result;
    }
}
