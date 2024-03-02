## Coroutine
- 필요에 따라 함수를 일시 정지(suspend)하고 재개(resume)할 수 있는 구성요소
- 비선점형 multitasking을 구현하기 위한 방법
  - blocking 작업을 기다리는 동안 다른 작업을 먼저 처리함으로써 cpu 유휴시간을 최소화
- kolin complier에 의해 CPS(Continuation-Passing Style)로 변환되어 실행됨
- corountine dispatcher를 통해 실행 또는 재개
- suspend 함수는 중단 시점까지 비선점으로 동작
- context는 continuation이라는 parameter형태로 전달
  - thread context switching 발생하지 않음

## CPS (Continuation-Passing Style)
- 함수가 반환하는 대신에 다음에 실행할 코드를 인자로 받아서 실행하는 방식

## Reactor와 Corountine 차이점


### Reactor
- Non-Bloking I/O + Backpressure 
- https://devfunny.tistory.com/914

### Couroutine
- 일시중지할 수 있는 프로그래밍을 통해 cpu 유휴시간 최소화를 목적 