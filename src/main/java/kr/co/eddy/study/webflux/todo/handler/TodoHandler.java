package kr.co.eddy.study.webflux.todo.handler;

import kr.co.eddy.study.webflux.todo.domain.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public class TodoHandler {

    @Autowired

    public Mono<ServerResponse> getTodo(ServerRequest request) {

        return null;
    }
}
