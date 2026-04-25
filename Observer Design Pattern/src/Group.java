import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<ISubscriber> users = new ArrayList<>();


    public void subscribe(ISubscriber user) {
        users.add(user);
    }


    public void unsubscribe(User user) {
        users.remove(user);
    }

    public void notify(String msg) {
        for(ISubscriber user : users){
            user.notify(msg);
        }
    }
}
