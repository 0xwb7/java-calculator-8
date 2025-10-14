package calculator;

import calculator.controller.CalcController;
import calculator.io.InputView;
import calculator.io.OutputView;
import calculator.service.CalcService;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        CalcController calcController = new CalcController(new CalcService());

        // 사용자 입력 받기
        String str = InputView.readLine();
        int result = calcController.calc(str);
        OutputView.output(result);
    }
}
