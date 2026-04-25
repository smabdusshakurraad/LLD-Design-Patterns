public class Main {
    public static void main(String[] args) {
        DataService service = new DataService();

        service.setCacheStrategy(new InMemoryCacheStrategy());
        service.processData("user:123", "{name: 'Abdus', role: 'admin'}");

        service.setCacheStrategy(new RedisCacheStrategy());
        service.processData("user:124", "{name: 'Alice', role: 'user'}");
    }
}
