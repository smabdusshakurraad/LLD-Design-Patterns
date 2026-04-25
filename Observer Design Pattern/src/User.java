public class User implements ISubscriber{
    private Long userId;
    public User(Long userId){
        this.userId = userId;
    }

    public void notify(String msg){
        System.out.println("User " + userId + " received msg " + msg);
    }
}
