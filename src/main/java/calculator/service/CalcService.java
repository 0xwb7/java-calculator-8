package calculator.service;

import calculator.service.math.SumNum;
import calculator.service.parsing.NumberParser;
import calculator.service.parsing.Preprocessor;
import calculator.service.parsing.RegexParser;
import calculator.service.parsing.Tokenizer;

import java.util.List;

public class CalcService {

    private final Preprocessor preprocessor = new Preprocessor();
    private final RegexParser regexParser = new RegexParser();
    private final Tokenizer tokenizer = new Tokenizer();
    private final NumberParser numberParser = new NumberParser();
    private final SumNum sumnum = new SumNum();

    public int calc(String input) {

        Preprocessor.Normalized norm = preprocessor.validateAndNormalize(input);
        if (norm.empty()) {
            return 0;
        }

        RegexParser.Regex reg = regexParser.parse(norm.value());

        List<String> tokens = tokenizer.split(reg.payload(), reg.delimiterRegex());

        List<Integer> numbers = numberParser.parse(tokens);

        return sumnum.sum(numbers);
    }
}
