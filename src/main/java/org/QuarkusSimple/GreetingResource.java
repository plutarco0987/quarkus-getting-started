package org.QuarkusSimple;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//PARA COMPILAR USAR ./mvnw compile quarkus:dev
@Path("/todos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {

    private List<Todo> todos = new ArrayList<Todo>();

    @GET
    public List<Todo> getTodos() {
        return todos;
    }

    @POST
    public void addTodo(Todo todo) {
        todos.add(todo);
    }
}
