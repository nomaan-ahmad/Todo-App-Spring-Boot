package com.nomaan.TodoApp.config;

import com.nomaan.TodoApp.models.TodoItem;
import com.nomaan.TodoApp.repositories.TodoItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoItemDataLoader implements CommandLineRunner {

    private final TodoItemRepository todoItemRepository;
    private final Logger logger = LoggerFactory.getLogger(TodoItemDataLoader.class);
    public TodoItemDataLoader (TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData () {
        if (todoItemRepository.count() == 0) {
            TodoItem todoItem1 = new TodoItem("Get the Job");
            TodoItem todoItem2 = new TodoItem("Learn Java");

            todoItemRepository.save(todoItem1);
            todoItemRepository.save(todoItem2);
        }

        logger.info("Number of todoItems: {}", todoItemRepository.count());
    }
}
