package pl.krzysztof.pizzaapplication.remote.rest.dto;

import java.util.List;

public class PizzaDto {
    private Integer id;
    private String name;
    List<SizeDto> sizes;
}
