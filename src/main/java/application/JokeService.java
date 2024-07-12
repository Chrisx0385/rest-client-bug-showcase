package application;

import adapter.out.RandomJokeClient;
import adapter.out.DadJokeClientWithFilter;
import io.quarkus.logging.Log;
import jakarta.inject.Singleton;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Singleton
public class JokeService {

    @RestClient
    DadJokeClientWithFilter dadJokeClientWithFilter;

    @RestClient
    RandomJokeClient randomJokeClient;

    public void getJokes() {
        Log.info("Start");
        Log.info(dadJokeClientWithFilter.get());
        Log.info(randomJokeClient.get());
        Log.info("End");
    }
}
