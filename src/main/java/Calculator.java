public class Calculator {
    public static <T1 extends Number, T2 extends Number>Double sum(T1 a, T2 b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number>Double multiply(T1 a, T2 b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number>Double divide(T1 a, T2 b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number>Double subtract(T1 a, T2 b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T1, T2> boolean compareArrays(T1[] first, T2[] second) {
        if (first.length != second.length) return false;
        int size = first.length;

        for (int i = 0; i < size; i++) {
            if (first[i].getClass() != second[i].getClass()) return false;
        }
        return true;
    }
}
