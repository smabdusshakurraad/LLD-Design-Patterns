//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            Logger logger1 = Logger.getLogger();
            logger1.log("This message is from user 1");
        });

        Thread thread2 = new Thread(()->{
            Logger logger2 = Logger.getLogger();
            logger2.log("This message is from user 2");
        });

        thread1.start();
        thread2.start();
    }
}