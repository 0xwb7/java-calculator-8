package calculator.service.parsing;

public class Preprocessor {

    public record check(String value, boolean empty) {}

    public check checkString(String input) {

        // 공백 입력 처리
        if (input.trim().isEmpty()) {
            return new check("", true);
        }

        return new check(input, false);
    }
}
