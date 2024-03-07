package com.sao.rest;

import com.sao.entity.Todo;
import com.sao.service.TodoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


/**
 * @author saozd
 * @project com.com.sao.rest javaeewokspace
 * @date 23 Feb 2024
 * <p>
 * @description:
 */
@Path("todo")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TodoRest {
    @Inject
    TodoService todoService;

    @Path("new")
    @POST
    public Response createTodo(Todo todo) {
        //api/v1/todo/new
        todoService.createTodo(todo);
        return Response.ok(todo).build();
    }

    @Path("update")
    @PUT
    public Response updateTodo(Todo todo) {
        todoService.updateTodo(todo);
        return Response.ok(todo).build();
    }

    @Path("{id}")
    @GET
    public Todo getTodo(@PathParam("id") Long id) {
        return todoService.findTodoDoById(id);
    }

    @Path("list")
    @GET
    public List<Todo> geTodos(){
        return todoService.getTodos();
    }

    @Path("status")
    @POST
    public Response markAsComplete(@QueryParam("id") Long id){
        Todo todo = todoService.findTodoDoById(id);
        todo.setCompleted(true);
        todoService.updateTodo(todo);
        return Response.ok(todo).build();
    }
}
