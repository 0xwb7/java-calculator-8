package calculator.service.math;

import java.util.List;

public class SumNum {

    public int sum(List<Integer> numbers) {
        long result = 0;

        for (int n : numbers) {
            result += n;
        }

        if (result > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("too big");
        }

        return (int) result;
    }
}
