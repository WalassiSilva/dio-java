package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
//        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
//        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
//        System.out.println(eager);
        eager = SingletonEager.getInstance();
//        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
//        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
//        System.out.println(lazyHolder);

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robot robot = new Robot();

        robot.setComportamento(normal);
        robot.mover();
        robot.mover();

        robot.setComportamento(defensivo);
        robot.mover();

        robot.setComportamento(agressivo);
        robot.mover();
        robot.mover();
        robot.mover();

        Facade facade = new Facade();
        facade.migrarCliente("Walassi", "12341234");
    }
}
