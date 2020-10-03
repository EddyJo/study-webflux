package kr.co.eddy.study.webflux.studywebflux.router;


import kr.co.eddy.study.webflux.studywebflux.domain.HelloWorld;
import kr.co.eddy.study.webflux.studywebflux.handler.HelloWorldHandler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.Assertions.assertThat;

@WebFluxTest
@Import(value = HelloWorldHandler.class)
public class HelloWorldRouterTest {
    @Autowired
    private WebTestClient webClient;

    @Test
    public void get_hello_응답_테스트() {
        HelloWorld responseBody = webClient.get().uri("/hello").exchange()
                .expectStatus().isOk()
                .expectBody(HelloWorld.class)
                .returnResult().getResponseBody();
        assertThat(responseBody.getId()).isEqualTo(1);
        assertThat(responseBody.getTitle()).isEqualTo("hello");
        assertThat(responseBody.getMessage()).isEqualTo("say hi");
    }
}
