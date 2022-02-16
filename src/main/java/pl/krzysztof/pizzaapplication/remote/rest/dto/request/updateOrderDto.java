package pl.krzysztof.pizzaapplication.remote.rest.dto.request;

import pl.krzysztof.pizzaapplication.domain.OrderStatusType;

import java.util.List;

public class updateOrderDto {
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
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

    public updateOrderDto() {
    }

    public updateOrderDto(OrderStatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }
}
