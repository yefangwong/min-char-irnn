package math;

public class MathUtils {
    public static int clampInt(int value, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min must be <= max");
        }

        if (value < min) return min;
        if (value > max) return max;
        return value;
    }
}
