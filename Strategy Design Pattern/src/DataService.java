public class DataService {
    private CacheStrategy cacheStrategy;

    public void setCacheStrategy(CacheStrategy cacheStrategy) {
        this.cacheStrategy = cacheStrategy;
    }

    public void processData(String key, String payload){
        cacheStrategy.write(key, payload);
    }
}
