public class ForLoop {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 20; i++) {
        System.out.println(i + " Carneirinho");
        }

        String alunos[] = { "Ana", "Bruno", "Catia", "Danilo", "Estela", "Fabiana", "Gustavo" };

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno de index " + i + " é: " + alunos[i]);
        }

        for( String aluno : alunos){
            System.out.println("Aluno: "+ aluno);
        }

        
    }
}
