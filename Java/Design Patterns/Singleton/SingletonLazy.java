public class SingletonLazy {
    private static SingletonLazy _instance;

    private SingletonLazy() {}

    //Lazy initialization - thread safe
    public static synchronized SingletonLazy getInstance() {
            if (_instance == null) {
                _instance = new SingletonLazy();
            }
            return _instance;
        }
        //class definition...
}