package dio.gof.facade;

import dio.gof.subsistema2.cep.CepApi;
import dio.gof.susbistema1.crm.CrmService;

public class Facade {
    public void migrarCliente ( String nome, String cep){
        String cidade = CepApi.getInstance().getCidade(cep);
        String estado = CepApi.getInstance().getEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
