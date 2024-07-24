package dio.gof.singleton;
/**
 * Singlegon Lazy Holder
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Ref</a>
 *
 * @author Walassi
 * */
public class SingletonLazyHolder {
    private static class Holder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return Holder.instance;
    }
}
