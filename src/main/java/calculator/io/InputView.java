package calculator.io;

import camp.nextstep.edu.missionutils.Console;

public final class InputView {

    // no instantiation
    private InputView() {}

    public static String readLine() {
        System.out.println(IOMessage.INPUT);
        String input = Console.readLine();

        return input == null ? "" : input;
    }
}
