package guru.springframework.spring6di.controllers.env;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
@ActiveProfiles({"prod","EN" })
public class MyEnvControllerTestProd {
    @Autowired
    MyEnvController myEnvController;

    @Test
    void datasource() {

        assertTrue(myEnvController.getDatasource().equals("prod"));
    }
}
