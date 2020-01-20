package xyz.fengqing11.springbootrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.fengqing11.springbootrest.pojo.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
