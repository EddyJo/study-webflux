package kr.co.eddy.study.webflux.study;

import kr.co.eddy.study.webflux.todo.domain.Todo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



public class MonoAndFluxTest {

    @DisplayName("모노 생성 및 subscribe 테스트")
    @Test
    public void 모노생성_Subscribe_테스트() {
        Todo todo = Todo.builder().id(1l).content("모노 공부").build();
        Mono<Todo> todoMono = Mono.just(todo);
        System.out.println("todoMono : " + todoMono);
        todoMono.subscribe(value -> System.out.println(value));
    }
    @DisplayName("Flux 생성 및 subscribe 테스트")
    @Test
    public void Flux생성_Subscribe_테스트() {
        Flux<Todo> todoList = Flux.just(
                Todo.builder().id(1l).content("Mono 공부").build(),
                Todo.builder().id(2l).content("Flux 공부").build(),
                Todo.builder().id(3l).content("Reactor 공부").build(),
                Todo.builder().id(4l).content("공부 그만 하기").build()
        );
        todoList.subscribe(value -> System.out.println(value));
        todoList.subscribe(value -> value.setDone(true));
        System.out.println(">>>>>>>>>>>>> TODO LIST ALL Clear <<<<<<<<<<<<<<<<");
        todoList.subscribe(value -> System.out.println(value));
    }

    @DisplayName("Flux 구독과 신호발생")
    @Test
    public void Flux_구독과_신호발생() {
        Flux<Todo> todoList = Flux.just(
                Todo.builder().id(1l).content("Mono 공부").build(),
                Todo.builder().id(2l).content("Flux 공부").build(),
                Todo.builder().id(3l).content("Reactor 공부").build(),
                Todo.builder().id(4l).content("공부 그만 하기").build()
        );


        todoList.doOnNext(value -> {
                                        System.out.println("next : " + value);
                                        value.setDone(true);
                                    }
                        )
                .subscribe(value -> System.out.println("subscribe : " + value));


    }


}