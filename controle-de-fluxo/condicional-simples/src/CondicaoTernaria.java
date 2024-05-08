public class CondicaoTernaria {
    public static void main(String[] args) {

        int nota = 8;

        String resultado = nota > 6
                ? "APROVADO"
                : nota > 4
                        ? "RECUPERAÇÃO"
                        : "REPROVADO";

        System.out.println(resultado);

    }

}
