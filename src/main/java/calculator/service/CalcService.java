package calculator.service;

import calculator.service.math.SumNum;
import calculator.service.parsing.NumberParser;
import calculator.service.parsing.RegexParser;
import calculator.service.parsing.Tokenizer;

import java.util.List;

public class CalcService {

    private final RegexParser regexParser = new RegexParser();
    private final Tokenizer tokenizer = new Tokenizer();
    private final NumberParser numberParser = new NumberParser();
    private final SumNum sumNum = new SumNum();

    public int calc(String input) {

        if (input == null || input.isBlank()) {
            return 0;
        }

        RegexParser.regex reg = regexParser.parse(input);
        List<String> tokens = tokenizer.split(reg.payload(), reg.delimiterRegex());
        List<Integer> numbers = numberParser.parse(tokens);

        return sumNum.sum(numbers);
    }
}
