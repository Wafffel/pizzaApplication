package pl.krzysztof.pizzaapplication.remote.rest.dto.response;

import java.util.List;

public class menuDto {
    private List<PizzaDto> menu;

    public menuDto() {
    }

    public menuDto(List<PizzaDto> menu) {
        this.menu = menu;
    }

    public void setMenu(List<PizzaDto> menu) {
        this.menu = menu;
    }

    public List<PizzaDto> getMenu() {
        return menu;
    }
}
