package com.Andreinc.springboottodoapplication.repositories;

import com.Andreinc.springboottodoapplication.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
