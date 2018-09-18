import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit.loader.PactBrokerAuth;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import main.ServiceApp;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.web.context.ConfigurableWebApplicationContext;


@RunWith(PactRunner.class)
@Provider("test_provider")
//@PactFolder("/Users/sujeet.kumar/workspaces/samplespringboot/pacts")
@PactBroker(host = "192.168.99.100", protocol = "http", port = "30284", authentication = @PactBrokerAuth(username = "admin", password = "example"))
public class ProviderSideTest {


    @TestTarget
    public final Target target = new HttpTarget("http","localhost", 7171, "/");

    private static ConfigurableWebApplicationContext application;

    @BeforeClass
    public static void start(){
        application = (ConfigurableWebApplicationContext) SpringApplication.run(ServiceApp.class);
    }

    @State("test GET")
    public void toGetState(){
        System.out.println("Get to GET State");
    }

    @State("test POST")
    public void toPostState(){
        System.out.println("Get to POST State");
    }

}
