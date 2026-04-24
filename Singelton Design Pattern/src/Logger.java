public class Logger {
    private static int count = 0;
    private static Logger logger;
    private Logger(){
        count++;
        System.out.println("New Instance created count " + count);
    }

    public static Logger getLogger(){
        if( logger == null ){
            logger = getInstance();
        }

        return logger;
    }

    private static synchronized Logger getInstance(){
        if( logger == null ){
            logger = new Logger();
        }

        return logger;
    }
    public void log(String msg){
        System.out.println(msg);
    }
}
