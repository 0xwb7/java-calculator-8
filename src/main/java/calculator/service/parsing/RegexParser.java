package calculator.service.parsing;

import java.util.regex.Pattern;

public class RegexParser {

    public static final class Regex {
        private final String delimiterRegex;
        private final String payload;

        public Regex(String delimiterRegex, String payload) {
            this.delimiterRegex = delimiterRegex;
            this.payload = payload;
        }

        public String getDelimiterRegex() {
            return delimiterRegex;
        }

        public String getPayload() {
            return payload;
        }
    }

    public Regex parse(String input) {
        final String DEFAULT_DELIMITER = "[,:]";

        // 커스텀 구분자일 경우
        if (input.startsWith("//")) {
            int nl = input.indexOf('\n');
            if (nl < 0) {
                throw new IllegalArgumentException("no delimiter found");
            }

            String custom = input.substring(2, nl);

            if (custom.isEmpty()) {
                throw new IllegalArgumentException("custom empty");
            }

            if (custom.length() != 1) {
                throw new IllegalArgumentException("only one delimiter allowed");
            }

            String payload = input.substring(nl + 1);
            String delimiter = Pattern.quote(custom);
            return new Regex(delimiter, payload);
        }

        return new Regex(DEFAULT_DELIMITER, input);
    }
}
