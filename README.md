# rest-client-bug-showcase

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

This will log something like that:
```
2024-07-12 11:40:19,652 INFO  [app.JokeService] (Quarkus Main Thread) Start
2024-07-12 11:40:19,653 INFO  [ada.out.TheClientRequestFilter] (Quarkus Main Thread) https://icanhazdadjoke.com/
2024-07-12 11:40:19,886 INFO  [app.JokeService] (Quarkus Main Thread) {"id":"1oGYLu4T7Ed","joke":"Why is Peter Pan always flying? Because he Neverlands.","status":200}

2024-07-12 11:40:19,888 INFO  [ada.out.TheClientRequestFilter] (Quarkus Main Thread) https://official-joke-api.appspot.com/random_joke
2024-07-12 11:40:20,179 INFO  [app.JokeService] (Quarkus Main Thread) {"type":"general","setup":"What do you call a cow with no legs?","punchline":"Ground beef!","id":57}
2024-07-12 11:40:20,179 INFO  [app.JokeService] (Quarkus Main Thread) End

```
as you can see, the filter logs the url of both requests, not only the one where it is registered.