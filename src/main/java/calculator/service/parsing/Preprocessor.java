package calculator.service.parsing;

public class Preprocessor {

    public record Normalized(String value, boolean empty) {}

    public Normalized validateAndNormalize(String input) {
        // 공백 입력 처리
        if (input.trim().isEmpty()) {
            return new Normalized("", true);
        }

        // 운영체제별 줄바꿈 문자 통일
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
