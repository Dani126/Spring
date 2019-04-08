package sk.jaroslavbeno.springlearn2code.services.impl;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import sk.jaroslavbeno.springlearn2code.model.Employee;
import sk.jaroslavbeno.springlearn2code.model.Todo;
import sk.jaroslavbeno.springlearn2code.model.TodoList;
import sk.jaroslavbeno.springlearn2code.services.RestApiService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RestApiServiceImpl implements RestApiService {
    @Override
    public Employee getEmployee(Long id) {

        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Arrays.asList(MediaType.ALL));
        messageConverters.add(converter);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(messageConverters);

        Employee employee =
                restTemplate.getForObject("http://dummy.restapiexample.com/api/v1/employee/8961",
                        Employee.class);

        return employee;
    }

    @Override
    public Todo getTodo(Long id) {
        RestTemplate restTemplate = new RestTemplate();

        Todo todo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1",
                Todo.class);
        return todo;
    }

    @Override
    public List<Todo> getTodos() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<Todo>> responseEntity = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/todos",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Todo>>(){}
        );

        List<Todo> todos = responseEntity.getBody();
        return todos;
    }

    @Override
    public TodoList getTodoList() {
        RestTemplate restTemplate = new RestTemplate();
        TodoList todoList = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos",
                TodoList.class);
        return todoList;
    }

    public static void main(String[] args) {
        RestApiServiceImpl restApiService = new RestApiServiceImpl();
//        Employee employee = restApiService.getEmployee(8961L);
//        System.out.println(employee.getEmployeeName());

//        Todo todo = restApiService.getTodo(1L);
//        System.out.println(todo.getTitle());
//
//        System.out.println(restApiService.getTodos());
        System.out.println(restApiService.getTodoList().getTodos());

    }
}
