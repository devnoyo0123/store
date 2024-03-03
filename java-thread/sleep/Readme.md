# sleep
- sleep 메서드는 지정된 시간 동안 현재 스레드를 일시 정지하고 대기상태로 빠졌다가 시간이 지나면 실행대기 상태로 전환된다.
- [네이티브 메서드](https://www.ibm.com/docs/ko/i/7.3?topic=languages-native-methods-java-native-interface)로 연결되며 시스템 콜 통해 커널모드에서 수행 후 유저모드로 전환한다.

# sleep() 작동방식
- thread가 sleep(ms) 메서드 실행시 -> Timed_waiting 상태로 전환된다. 지정된 시간이 지나면 -> Runnable 상태로 전환된다.
- 인터럽트 될 경우 InterruptedException이 발생한다.
  - 실행대기로 전환된다.
  - 실행 상태가 되면 예외를 처리합니다.
- 동기화 메서드 영역에서 sleep() 메서드를 호출하면 스레드는 획득한 모니터나 락을 잃지 않고 유지한다.
- 

# sleep(0), sleep(n)의 의미
## sleep(0) 
- 스레드가 커널 모드로 전환후 스케줄러는 현재 스레드와 동일한 우선순위의 스레드가 있을 경우 실행 대기 상태 스레드에게 cpu를 할당함으로서 context switching이 발생한다.
- 우선순위가 동일한 실행 대기 상태의 다른 스레드가 없다면 스케쥴러는 현재 스레드에게 계속 cpu를 할당하여 context switching이 없고 모드 전환만 일어난다.

## sleep(n)
- 스레드가 커널 모드로 전환 후 스케줄러는 현재 스레드를 대기 상태로 두고 다른 스레드에게 cpu를 할당함으로써 모드 전환과 함께 context switching이 발생한다.


