package pl.krzysztof.pizzaapplication.remote.rest.dto.request;

import java.util.List;

public class addOrderDto {
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public addOrderDto() {
    }

    public void setPerson(PersonOrderDto person) {
        this.person = person;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPerson() {
        return person;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public addOrderDto(List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.pizzas = pizzas;
        this.person = person;
    }
}
