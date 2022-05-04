package capitulo8.utils.lab1;

import java.util.Arrays;

public class NumberFuncionalities {

    public static int getMax (int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt();
    }
    public static int getMin (int[] numbers) {
        return Arrays.stream(numbers).min().getAsInt();
    }
}
