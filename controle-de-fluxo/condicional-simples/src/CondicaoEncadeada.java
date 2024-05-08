public class CondicaoEncadeada {

    public static void main(String[] args) {
        int nota = 6;

        if (nota > 6)
            System.out.println("APROVADO!");

        else if (nota > 5) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO!");
        }
    }

}
