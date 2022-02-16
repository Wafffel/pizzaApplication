package pl.krzysztof.pizzaapplication.remote.rest.dto.response;

import pl.krzysztof.pizzaapplication.domain.OrderStatusType;
import pl.krzysztof.pizzaapplication.remote.rest.dto.request.PersonOrderDto;
import pl.krzysztof.pizzaapplication.remote.rest.dto.request.PizzaOrderDto;

import java.util.List;

public class OrderDto {
    private Integer id;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public Integer getId() {
        return id;
    }

    public OrderDto(Integer id, OrderStatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public OrderDto() {
    }
}
