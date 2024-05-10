import java.util.Random;

public class DoWhile {
    public static void main (String []args){
        do {
            System.out.println("Telefone tocando");
        } while(estaTocando());
        System.out.println("Alô!");
    }

    private static boolean estaTocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu " + atendeu);
        return !atendeu;
    }
}
