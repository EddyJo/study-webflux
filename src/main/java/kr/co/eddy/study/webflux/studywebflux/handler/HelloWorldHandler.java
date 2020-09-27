package kr.co.eddy.study.webflux.studywebflux.handler;

import kr.co.eddy.study.webflux.studywebflux.domain.HelloWorld;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloWorldHandler {

    public Mono<ServerResponse> helloWorld(ServerRequest request) {

        Mono<HelloWorld> helloWorldMono = Mono.just(new HelloWorld(1, "hello", "say hi"));
        return ServerResponse.ok().body(helloWorldMono, HelloWorld.class);
    }
}
