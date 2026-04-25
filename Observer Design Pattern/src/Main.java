public class Main {
    public static void main(String []args){
        Group group = new Group();

        User user1 = new User(1L);
        User user2 = new User(2L);
        User user3 = new User(3L);

        group.subscribe(user1);
        group.subscribe(user2);
        group.subscribe(user3);

        group.notify(" new msg");

        group.unsubscribe(user1);
        group.notify("new new msg");
    }
}
