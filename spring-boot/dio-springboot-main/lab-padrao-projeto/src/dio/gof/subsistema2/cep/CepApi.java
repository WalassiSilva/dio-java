package dio.gof.subsistema2.cep;

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getCidade(String cep){
        return "Belo Horizonte";
    }

    public String getEstado(String cep){
        return "MG";
    }
}