package guru.springframework.spring6di.services.env;

import guru.springframework.spring6di.services.EnvService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("envService")
@Profile("uat")
public class UatEnvService implements EnvService {
    @Override
    public String datasource() {
        return "uat";
    }
}
