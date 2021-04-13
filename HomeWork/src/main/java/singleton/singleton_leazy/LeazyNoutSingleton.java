package singleton.singleton_leazy;

public class LeazyNoutSingleton {
    private static LeazyNoutSingleton leazyNoutSingleton = null;
    private LeazyNoutSingleton(){
    }
    public static LeazyNoutSingleton getInstance(){
        if(leazyNoutSingleton == null){
            synchronized (LeazyNoutSingleton.class){
                leazyNoutSingleton = new LeazyNoutSingleton();
            }
        }
        return leazyNoutSingleton;
    }
}
