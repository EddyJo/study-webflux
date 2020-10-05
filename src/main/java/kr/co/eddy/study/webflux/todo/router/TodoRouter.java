package kr.co.eddy.study.webflux.todo.router;

import kr.co.eddy.study.webflux.todo.handler.TodoHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class TodoRouter {

    @Bean
    public RouterFunction<ServerResponse> routes(TodoHandler handler) {
        return null;
    }

}
