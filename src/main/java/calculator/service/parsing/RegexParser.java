package calculator.service.parsing;

import java.util.regex.Pattern;

public class RegexParser {

    public record regex(String delimiterRegex, String payload) {}

    public regex parse(String input) {

        // 커스텀 구분자일 경우
        if (input.startsWith("//")) {
            int nl = input.indexOf("\\n");
            if (nl < 0) {
                throw new IllegalArgumentException("no delimiter found");
            }

            String custom = input.substring(2, nl);

            if (custom.isEmpty()) {
                throw new IllegalArgumentException("empty custom delimiter");
            }

            if (custom.length() != 1) {
                throw new IllegalArgumentException("only one delimiter allowed");
            }

            if (Character.isDigit(custom.charAt(0))) {
                throw new IllegalArgumentException("number not allowed");
            }

            String payload = input.substring(nl + 2);
            String delimiter = "[,:]" + "|" + Pattern.quote(custom); // 커스텀 구분자와 기본 구분자 혼합 사용 가능
            return new regex(delimiter, payload);
        }

        // 커스텀 구분자 아닌 경우
        return new regex("[,:]", input);
    }
}
