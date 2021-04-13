package singleton.singleton_s;

public class NoutSingleton {
    private static final NoutSingleton NOUT_SINGLETON = new NoutSingleton();
    private NoutSingleton(){}
    public static NoutSingleton getInstance(){
        return NOUT_SINGLETON;
    }
}
