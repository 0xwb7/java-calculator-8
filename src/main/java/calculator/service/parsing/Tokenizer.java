package calculator.service.parsing;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Tokenizer {

    // 빈 토큰 제거
    public List<String> split(String payload, String delimiterRegex) {
        return Arrays.stream(payload.split(delimiterRegex))
                .map(String::trim)
                .filter(Predicate.not(String::isBlank))
                .toList();
    }
}
