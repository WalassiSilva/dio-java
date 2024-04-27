public class App {
    public static void main(String[] args) throws Exception {
        // concatenar();
        // unarios();
        // ternario(2, 1);
        // relacionais();
        logicos();
    }

    public static void concatenar() {
        String concat = "?";

        concat = 1 + 1 + 1 + "1"; // resultado 31. Irá somar atá encontrar a string e fará a concatenação
        System.out.println(concat);

        concat = 1 + "1" + 1 + 1; // resultado 1111. A string faz parte da primeira operaçao, todo resto será
                                  // concatenado
        System.out.println(concat);

        concat = 1 + "1" + 1 + "1"; // resultado 1111. A string faz parte da primeira operaçao, todo resto será
                                    // concatenado
        System.out.println(concat);

        concat = "1" + (1 + 1 + 1); // resultado 13. Primeiro é executado o que estiver entre parênteses e após isso
                                    // identificou a string
        System.out.println(concat);
    }

    public static void unarios() {
        System.out.println();

        int n = 5;
        System.out.println(n);

        n = -n;
        System.out.println(n);

        n = +n;
        System.out.println(n);

        n = n * -1;
        System.out.println(n);

        n++;
        System.out.println(n);

        n--;
        System.out.println(n);

        System.out.println("incremetação apos: " + n++);
        System.out.println("decremetação apos: " + n--);
        System.out.println("incremetação antes: " + --n);
        System.out.println("incremetação antes: " + ++n);
    }

    public static void ternario(int a, int b) {

        String resultado = a == b ? "IGUAL" : "DIFERENTE";
        System.out.println(resultado);
    }

    public static void relacionais(){
        int a = 1;
        int b = 2;
        System.out.println(a + " e " + b);

        if(a > b) System.out.println("Maior");
        if(a < b) System.out.println("Menor");

        if(a >= b) System.out.println("Maior ou igual");
        if(a <= b) System.out.println("Menor ou igual");

        if(a == b) System.out.println("Igual");
        if(a != b) System.out.println("Diferente");

        
        String nome1 = "Ana";
        String nome2 = "Joy";
        System.out.println(nome1.equals(nome2));
        
        String nome3 = new String("Ana");
        System.out.println(nome1 == nome3);
        System.out.println(nome1.equals(nome3));

    }

    public static void logicos() {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
    }
}
