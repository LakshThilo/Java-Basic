package threadExample;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while(i<=20){
            System.out.println(i+ " "+Thread.currentThread().getName());
            i++;
        }
    }
}
