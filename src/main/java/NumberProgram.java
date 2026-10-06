public class NumberProgram {

    public static int findResult(int[] values) {
        if (values.length == 0) {
            return Integer.MIN_VALUE;
        }

        int largest = values[0];

        for (int value : values) {
            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }

}
