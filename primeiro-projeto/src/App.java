public class App {
    public static void main(String[] args) {

        float rendaMes03 = MinhaClasse.somarRenda(2200,218);
        System.out.println(rendaMes03);

        String nome = "walassi";    
        String sobrenome = "Silva";

        String nomeCompleto = MinhaClasse.nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
    }
}
