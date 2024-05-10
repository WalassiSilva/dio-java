public class Switch {
    public static void main(String[] args) {
        char tamanho = 'M';
        switch (tamanho) {
            case 'P':
                System.out.println("PEQUENO");
                break;
            case 'M':
                System.out.println("MÉDIO");
                break;
            case 'G':
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }

        char plano = 'A';

        switch(plano){
            case 'T': {
                System.out.println("5GB Youtube");
            }
            case 'M': {
                System.out.println("WhatsApp + Instagram grátis");
            }
            case 'B':
            System.out.println("1000 minutos de ligação");
            break;
            default: System.out.println("Valor inválido");
        }

    }
}
