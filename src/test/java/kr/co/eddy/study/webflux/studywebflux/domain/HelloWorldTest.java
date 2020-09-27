package kr.co.eddy.study.webflux.studywebflux.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldTest {

    @DisplayName("생성자 테스트")
    @Test
    public void 생성자테스트() {
        assertThat(new HelloWorld(1, "test", "test message")).isInstanceOf(HelloWorld.class);
    }
}
