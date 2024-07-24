package dio.gof.susbistema1.crm;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente gravado no sistema de CRM com sucesso!");
    }
}
