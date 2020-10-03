package kr.co.eddy.study.webflux.todo.repository;

import kr.co.eddy.study.webflux.todo.domain.Todo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class TodoRepositoryTest {

    @Autowired
    TodoRepository todoRepository;


    @DisplayName("findById 테스트")
    @Test
    public void ID로_TODO찾기() {

        long id = 1l;
        Todo todo = Todo.builder().id(id).content("밥먹기").build();
        todoRepository.save(todo);

        Optional<Todo> findOneTodo = todoRepository.findById(id);
        assertThat(findOneTodo.get()).isEqualTo(todo);
    }
}
