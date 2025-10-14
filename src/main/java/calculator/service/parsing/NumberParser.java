package calculator.service.parsing;

import java.util.ArrayList;
import java.util.List;

public class NumberParser {

    public List<Integer> parse(List<String> tokens) {
        List<Integer> num = new ArrayList<>(tokens.size());
        List<String> nonNum = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (String t: tokens) {
            if (t.isEmpty()) {
                continue;
            }

            try {
                int n = Integer.parseInt(t);

                if (n < 0) {
                    negative.add(n);
                }

                num.add(n);
            } catch (NumberFormatException e) {
                nonNum.add(t);
            }
        }

        if (!nonNum.isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (!negative.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return num;
    }
}
