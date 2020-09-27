package kr.co.eddy.study.webflux.studywebflux.router;

import kr.co.eddy.study.webflux.studywebflux.handler.HelloWorldHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class HelloWorldRouter implements WebFluxConfigurer {
    @Bean
    public RouterFunction<ServerResponse> routes(HelloWorldHandler handler) {
        return RouterFunctions.route(RequestPredicates.GET("/hello"), handler::helloWorld);
    }
}
