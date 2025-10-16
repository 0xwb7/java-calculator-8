# **java-calculator-precourse**

---

## **1. Application**

- InputView 클래스 호출
- OutputView 클래스 호출

## **2. Inputview**

- final + private 생성자를 통한 인스턴스화 방지
- IOMessage 클래스의 Input 메서드 호출을 통한 input message 출력
- BufferedReader을 통한 입력 후, 입력 받은 값 리턴

## **3. OutputView**

- IOMessage 클래스의 Output 메서드 호출을 통한 output message 출력

## **4. IOMessage**

- INPUT: input message
- OUTPUT: output message

## **5. CalcController**

- CalcService의 calc 메서드 호출

## **6. CalcService**

- RegexParser, Tokenizer, NumberParser, SumNum 클래스 호출
- input이 null이거나 공백일 시, 0 리턴

## **7. RegexParser**

- 기본 구분자 ( , : )를 기준으로 슬라이싱 후 숫자만 따로 반환하는 기능 구현
- 커스텀 구분자인 경우, 사용자가 입력한 특수기호를 기준으로 슬라이싱 후 숫자만 따로 반환하는 기능 구현

## **8. Tokenizer**

- 빈 토큰을 제거하는 기능 구현

## **9. NumberParser**

- 빈 토큰이 제거된 tokens에서 숫자를 가져와, 리스트에 저장하는 기능 구현

## **10. SumNum**

- Math.addExact 를 통해 정수의 최대값보다 큰 값이 들어오면 ArithmeticException 예외를 통한 오버플로우 방지