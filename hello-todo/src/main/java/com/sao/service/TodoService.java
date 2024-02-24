package com.sao.service;

/**
 * @author saozd
 * @project com.com.sao.service javaeewokspace
 * @date 23 Feb 2024
 * <p>
 * @description:
 */

import com.sao.entity.Todo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class TodoService {
    @PersistenceContext
    EntityManager entityManager;

    public Todo createTodo(Todo todo) {
        //Persist to db
        entityManager.persist(todo);
        return todo;
    }

    public Todo updateTodo(Todo todo) {
        entityManager.merge(todo);
        return todo;
    }

    public Todo findTodoDoById(Long id) {
        return entityManager.find(Todo.class, id);
    }

    public List<Todo> getTodos() {
        return entityManager.createQuery("SELECT t from Todo t", Todo.class).getResultList();
    }
}
