package Ch1;

public class Section1 {
    /**
     * 1.1.14
     *
     * @param N
     * @return
     */
    public static double lg(int N) {
        if (N == 0) return Double.NEGATIVE_INFINITY;
        if (N < 0) return Double.NaN;
        int base = 0;
        int result = 1;
        while (result <= N) {
            result *= 2;
            base++;
        }
        return base - 1;
    }

    /**
     * 1.1.15
     *
     * @param a
     * @param M
     * @return
     */
    public static int[] histogram(int[] a, int M) {
        int[] r = new int[M];
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            if (value < M) {
                r[value]++;
            }
        }
        return r;
    }

    /**
     * 1.1.16
     * @param n
     * @return
     */
    public static String exR1(int n) {
        if (n <= 0) return "";
        String s =  exR1(n - 3) + n + exR1(n - 2) + n;
//        System.out.println(s);
        return s;
    }

    /**
     * 1.1.20
     * @param N
     * @return
     */
    public static int factorial(int N) {
        if (N == 1) return 1;
        return  N * factorial(N - 1);
    }

    /**
     * 1.1.24
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p, int q) {
        System.out.println("p " + p + " q " + q);
        if (q == 0) return p;
        int r = p % q;
        return  gcd(q, r);
    }

}

