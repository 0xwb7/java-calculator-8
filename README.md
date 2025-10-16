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

- Preprocessor, RegexParser, Tokenizer, NumberParser, SumNum 클래스 호출
- Preprocessor
    - true 리턴 시 return 0
    - false 리턴 시 다음 메서드 호출

## **7. Preprocessor**

- 사용자의 입력값이 공백인지 확인
- 공백일 시 empty = true 리턴
- 공백 아닐 시 empty = false 리턴

## **8. RegexParser**

- 기본 구분자 ( , : )를 기준으로 슬라이싱 후 숫자만 따로 반환하는 기능 구현
- 커스텀 구분자인 경우, 사용자가 입력한 특수기호를 기준으로 슬라이싱 후 숫자만 따로 반환하는 기능 구현

## **9. Tokenizer**

- 빈 토큰을 제거하는 기능 구현

## **10. NumberParser**

- 빈 토큰이 제거된 tokens에서 숫자를 가져와, 리스트에 저장하는 기능 구현

## **11. SumNum**

- result값을 long으로 설정하여 int 범위 밖인 숫자도 안전하게 담기게 하였음. (오버플로우 방지)
- 추가로 최대 정수값보다 작으면 안전 캐스팅 기능 구현