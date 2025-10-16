package calculator.service.math;

import java.util.List;

public class SumNum {

    public int sum(List<Integer> numbers) {

        int sum = 0;
        for (int n : numbers) {
            sum = Math.addExact(sum, n);
        }

        return sum;
    }
}
