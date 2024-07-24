package dio.bean_component;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class CoversorJson {
    private Gson gson = new Gson();
    public ViaCepResponse converter(String json){
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
