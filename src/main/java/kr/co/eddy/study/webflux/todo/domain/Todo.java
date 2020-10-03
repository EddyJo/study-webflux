package kr.co.eddy.study.webflux.todo.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "TB_TODO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "DONE")
    @Builder.Default private boolean done = false;

    @Column(name = "CREATE_DATE_TIME")
    @Builder.Default private LocalDateTime createDateTime = LocalDateTime.now();

    @Column(name = "MODIFY_DATE_TIME")
    @Builder.Default private LocalDateTime modifiedDateTime = LocalDateTime.now();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return id == todo.id &&
                done == todo.done &&
                Objects.equals(content, todo.content) &&
                Objects.equals(createDateTime, todo.createDateTime) &&
                Objects.equals(modifiedDateTime, todo.modifiedDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, done, createDateTime, modifiedDateTime);
    }
}
