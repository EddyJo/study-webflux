package kr.co.eddy.study.webflux.todo.repository;

import kr.co.eddy.study.webflux.todo.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
