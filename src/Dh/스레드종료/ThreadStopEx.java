package Dh.스레드종료;

// 스레드 안전한 종료 : 원래는 stop() 메서드가 존재 했지만 현재 사용중지 되었음
// 대체 방법으로는 stop 플래그를 사용하는 방식, interrupt() 메서드를 사용하는 방식

public class ThreadStopEx {
    public static void main(String[] args) throws InterruptedException {
//        RunThread runThread = new RunThread();
//        runThread.start();
//        Thread.sleep(1000); // main thread가 sleep 상태가 됨
//        runThread.setStop(true);
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
        Thread.sleep(1000); // main 이 1초동안 스톱되었다가 다음 부분 실행,인터럽쓰레드는 진행하고 있음
        interruptThread.interrupt();
    }
}

// stop 플래그를 사용하는 방식
class RunThread extends Thread {
    private  boolean stop; // stop 플래그 설정

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            System.out.println("Thread 실행 중......");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}

class  InterruptThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 실행 중.....");
                Thread.sleep(1);
            }

        } catch (InterruptedException e) {
            System.out.println(e + "예외 발생!!!!");
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}