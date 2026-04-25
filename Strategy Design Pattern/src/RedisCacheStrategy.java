public class RedisCacheStrategy implements CacheStrategy{
    @Override
    public void write(String key, String payload) {
        System.out.println("Publishing '" + key + "' to distributed Redis cluster...");
    }
}
