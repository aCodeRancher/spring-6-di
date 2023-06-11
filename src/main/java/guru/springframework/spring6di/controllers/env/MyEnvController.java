package guru.springframework.spring6di.controllers.env;

import guru.springframework.spring6di.services.EnvService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyEnvController {

   private final EnvService envService;

    public MyEnvController( @Qualifier("envService")EnvService envService) {
            this.envService = envService;
     }

    public String getDatasource(){
            return envService.datasource();
        }
}
