package calculator.service.parsing;

public class Preprocessor {

    public static final class Normalized {
        private final String afterPreprocessString;
        private final boolean empty;

        public Normalized(String afterPreprocessString, boolean empty) {
            this.afterPreprocessString = afterPreprocessString;
            this.empty = empty;
        }

        public String getAfterPreprocessString() {
            return afterPreprocessString;
        }

        public boolean isEmpty() {
            return empty;
        }
    }

    public Normalized validateAndNormalize(String input) {
        if (input == null || input.isEmpty()) {
            return new Normalized("", true);
        }

        // 운영체제 줄바꿈 문자 통일
        String str = input.replace("\r\n", "\n").replace("\r", "\n");

        // 커스텀 구분자일 경우
        if (str.startsWith("//")) {
            int esc = str.indexOf("\\n");
            if (esc >= 0)
                str = str.substring(0, esc) + "\n" +  str.substring(esc + 2);
        }

        return new Normalized(str, false);
    }
}
