package dio.gof.singleton;

/**
 * singleton "preguiçoso".
 *
 * @author walassi
 * */
public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstance() {
        if(instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
