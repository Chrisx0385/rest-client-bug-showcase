package adapter.out;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "dad")
@RegisterProvider(TheClientRequestFilter.class)
public interface DadJokeClientWithFilter {

    @GET
    @Produces("application/json")
    String get();
}
