1. 랜덤 넘버 validation
1 - 9까지의 숫자만 허용

2. 랜덤 넘버 generate
흠.. 1번에서 만든 메소드랑 엮어서 ?
그럼 클래스를 분리 할 이유가 있나?

3. 공 비교 테스트
공 객체를 생성 -> 필요한 필드 : number, location
공 1개 당 ball,strike 판정함 -> 비교 대상은  0 0 0
볼 클래스, 비교 대상 볼 3개
-> 2번 리팩토링 기존처럼 string 으로 ball 을 받을 이유가 없어짐
ArrayList<Integer>로 변경
-> Enum 추가 STRIKE,BALL,NOTHING

4. 공 비교 심화
Ball 객체를 엔티티를 가지고 있는 Balls 클래스 ?
ArrayList를 Balls 엔티티 -> 이 방식이 나을듯, 위 방식은 입력을 
ball 객체로 다 따로 만들어줘야해서 별로인듯

0 1 3 | 2 5 6 
공 1개마다 ball.play()로 비교