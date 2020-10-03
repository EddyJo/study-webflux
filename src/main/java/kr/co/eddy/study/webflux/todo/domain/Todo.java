package kr.co.eddy.study.webflux.todo.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_TODO")
@Data
@Builder
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

}
