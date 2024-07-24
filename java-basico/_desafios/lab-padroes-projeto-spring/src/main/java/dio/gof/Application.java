package dio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto spring boot gerado via spring initializr
 * Dependências?
 * Spring data JPA
 * Spring Web
 * H2 database
 * OpenFeign
 * 
 * @author Walassi
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
