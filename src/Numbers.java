public class Numbers {

    public int[] numbers;

    public Numbers(int[] numbers) {
        this.numbers=numbers;
    }

    public static int find_max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int find_min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int[] maximal_sum(int[] numbers) {
        int[] sum = new int[numbers.length-1];
        int x = find_min(numbers);
        int counter=0;
        for (int i = 0; i < numbers.length; i++) {
            if (x != numbers[i]) {
                sum[counter] = numbers[i];
                counter++;
            }

        }
        return sum;
    }

    public static int[] minimal_sum(int[] numbers) {
        int[] sumi = new int[numbers.length-1];
        int x = find_max(numbers);
        int counter=0;
        for (int i = 0; i < numbers.length; i++) {
            if (x != numbers[i]) {
                sumi[counter] = numbers[i];
                counter++;
            }

        }
        return sumi;
    }
}
