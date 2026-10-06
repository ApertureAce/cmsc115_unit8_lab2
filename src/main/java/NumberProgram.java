public class NumberProgram {

    public static int findResult(int[] values) {
        int largest = values[0];

        for (int value : values) {
            if (value > largest) {
                largest = value;
            }
        }

        return largest;
    }

}
