package calculator.io;

import camp.nextstep.edu.missionutils.Console;

public final class InputView {

    // no instantiation
    private InputView() {}

    public static String readLine() {
        System.out.println(IOMessage.INPUT);

        return Console.readLine();
    }
}
