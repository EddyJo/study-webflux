package kr.co.eddy.study.webflux.todo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoTest {

    @DisplayName("TODO 생성 테스트")
    @Test
    public void TODO_생성_테스트() {

        //When
        long id = 1l;
        String content = "밥먹기";
        String dateTimeFormat = "yyyy-MM-dd HH:mm:ss";
        String expectedDateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateTimeFormat));
        Todo todo = Todo.builder().id(id).content(content).build();

        //Test
        assertThat(todo).isInstanceOf(Todo.class);
        assertThat(todo.getId()).isEqualTo(id);
        assertThat(todo.getCreateDateTime().format(DateTimeFormatter.ofPattern(dateTimeFormat))).isEqualTo(expectedDateTime);
        assertThat(todo.getModifiedDateTime().format(DateTimeFormatter.ofPattern(dateTimeFormat))).isEqualTo(expectedDateTime);
    }
}
