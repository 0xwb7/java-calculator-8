package calculator.service;

import calculator.service.math.SumNum;
import calculator.service.parsing.NumberParser;
import calculator.service.parsing.RegexParser;
import calculator.service.parsing.Tokenizer;

import java.util.List;

final class PipeLine {

    private final RegexParser regexParser = new RegexParser();
    private final Tokenizer tokenizer = new Tokenizer();
    private final NumberParser numberParser = new NumberParser();

    List<Integer> toNumber(String input) {
        RegexParser.Regex reg = regexParser.parse(input);
        List<String> tokens = tokenizer.split(reg.payload(), reg.delimiterRegex());
        return numberParser.parse(tokens);
    }
}

public class CalcService {

    private final PipeLine pipeLine = new PipeLine();
    private final SumNum sumNum = new SumNum();

    public int calc(String input) {

        if (input == null || input.isBlank()) {
            return 0;
        }

        List<Integer> numbers = pipeLine.toNumber(input);

        return sumNum.sum(numbers);
    }
}
