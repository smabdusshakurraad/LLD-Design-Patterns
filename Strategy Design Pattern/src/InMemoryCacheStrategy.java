public class InMemoryCacheStrategy implements CacheStrategy{

    @Override
    public void write(String key, String payload) {
        System.out.println("Writing '" + key + "' to local ConcurrentHashMap memory...");
    }
}
