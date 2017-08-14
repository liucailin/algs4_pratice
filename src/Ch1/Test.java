package Ch1;


import Tool.Print;

public class Test {

    public static void main(String[] args) {
        int[] r = Section1.histogram(new int[] {2, 3, 4, 5, 0, 5}, 10);
        Print.loopArray(r);

        Print.line(Section1.exR1(6));
        Print.line(Section1.factorial(5));
//        Section1.gcd(105,24);
        Section1.gcd(24,105);

        double[][] a = new double[][]{
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
        };

        double[][] b = new double[][] {
                {-1, -2, -3},
                {-1, -2, -3},
                {-1, -2, -3},
                {-1, -2, -3},
                {-1, -2, -3},
        };

        double[] v = new double[] { 9, 9, 9, 9, 9};
        double[] v2 = new double[] { 9, 9, 9};

        Print.loop2DArray(Matrix.transpose(a));
        Print.loop2DArray(Matrix.mult(a, b));
        Print.loopArray(Matrix.mult(a, v));
        Print.loopArray(Matrix.mult(v2, a));


    }
}
