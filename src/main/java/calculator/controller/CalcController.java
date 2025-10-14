package calculator.controller;

import calculator.service.CalcService;

public class CalcController {

    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    public int calc(String input) {
        return calcService.calc(input);
    }
}
