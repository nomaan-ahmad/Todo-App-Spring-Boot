package com.nomaan.TodoApp.repositories;

import com.nomaan.TodoApp.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
