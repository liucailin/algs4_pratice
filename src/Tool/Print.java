package Tool;

public class Print {
    public static void line(Object object) {
        System.out.println(object);
    }

    public static <T> void loopIterable(Iterable<T> iterable) {
        for (T t : iterable) {
            System.out.print(t);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void  loopArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
        System.out.println();
    }

    public static void  loopArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
        System.out.println();
    }

    public static void  loop2DArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
