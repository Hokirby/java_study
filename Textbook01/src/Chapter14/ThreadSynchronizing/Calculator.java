package Chapter14.ThreadSynchronizing;

public class Calculator {
    private int memory;

    public int setMemory() {
        return memory;
    }

    public synchronized void setMemory1(int memory) {
        this.memory = memory; //메모리 값 저장
        try {Thread.sleep(2000);} // 2초간 일시 정지
        catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);} // 메모리 값 읽기

    public void setMemory2(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {Thread.sleep(2000);}
            catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }
}
