import java.util.Arrays;

public class Array_numbers {

    public Array_numbers(int[] number1,int[] number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    int[] number1;
    int[] number2;

    public static int[] sum(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int carry = 0;
        int[] result = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            int total = arr1[i] + arr2[i] + carry;
            result[i + 1] = total % 10;
            carry = total / 10;
        }
        result[0] = carry;

        if (result[0] == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        }
        return result;
    }

    public static int[] diff(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] result = new int[n];
        int borrow = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = arr1[i] - arr2[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }
        return result;
    }

    public static int[] multiply(int[]number1,int n) {
        int m = number1.length;
        int carry = 0;
        int[] result = new int[m + 1];

        for (int i = m - 1; i >= 0; i--) {
            int total = number1[i]*n + carry;
            result[i + 1] = total % 10;
            carry = total / 10;
        }
        result[0] = carry;

        if (result[0] == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        }
        return result;

    }

    public static int[] div(int[] number1, int x) {
        int n = number1.length;
        int[] result = new int[n];
        int remainder = 0;

        for (int i = 0; i < n; i++) {
            int current = remainder * 10 + number1[i];
            result[i] = current / x;
            remainder = current % x;
        }

        return result;
    }

}
