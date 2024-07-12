package adapter.out;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "random")
public interface RandomJokeClient {

    @GET
    @Produces("application/json")
    String get();
}
