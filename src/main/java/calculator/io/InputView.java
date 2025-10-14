package calculator.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class InputView {

    private InputView() {}

    public static String readLine() {
        System.out.println(IOMessage.INPUT);

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            return str ==  null ? "" : str;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

    }
}
