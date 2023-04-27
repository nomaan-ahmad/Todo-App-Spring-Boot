package com.nomaan.TodoApp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "todo_item")
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private boolean complete;

    @Getter
    @Setter
    private Instant createdDate;

    @Getter
    @Setter
    private Instant modifiedDate;

    public TodoItem() {}

    public TodoItem(String description) {
        this.description = description;
        this.complete = false;
        this.createdDate = Instant.now();
        this.modifiedDate = Instant.now();
    }

    @Override
    public String toString() {
        return String.format("TodoItem{id= %d, description = %s, complete = %s, created-date = %s, modified-date = %s}",
                id, description, complete, createdDate, modifiedDate);
    }
}
