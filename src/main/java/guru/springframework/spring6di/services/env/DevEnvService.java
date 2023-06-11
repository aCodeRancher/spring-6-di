package guru.springframework.spring6di.services.env;

import guru.springframework.spring6di.services.EnvService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

 @Profile({"dev","default"})
@Service("envService")
public class DevEnvService implements EnvService {
    @Override
    public String datasource() {
        return "dev";
    }
}
