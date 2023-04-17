public class Talkative implements Runnable {
    private final int number;
    public Talkative(int number){
        this.number=number;
    }

    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            Thread thread = new Thread(new Talkative(i));
            thread.setName("Thread"+i);
            thread.start();
        }
    }

    @Override
    public void run() {

        for (int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+": number "+number);
        }

    }
}
