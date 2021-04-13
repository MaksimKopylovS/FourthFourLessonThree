package singleton.singleton_thread;

public class ThreadNoutSingleton {
    private static ThreadNoutSingleton threadNoutSingleton;

    private ThreadNoutSingleton(){
    }

    public static ThreadNoutSingleton getInstance(){
        if(threadNoutSingleton == null) {
            synchronized (ThreadNoutSingleton.class) {
                if (threadNoutSingleton == null) {
                    threadNoutSingleton = new ThreadNoutSingleton();
                }
            }
        }
        return threadNoutSingleton;
    }
}
