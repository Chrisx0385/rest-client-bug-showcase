package application;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Application implements QuarkusApplication {

    @Inject
    JokeService jokeService;
    @Override
    public int run(String... args) throws Exception {
        jokeService.getJokes();
        return 0;
    }
}
