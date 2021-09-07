import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("test")
public class TestController {
    @GET
    public String hej() {
        return "hva så";
    }

}
