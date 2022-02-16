package pl.krzysztof.pizzaapplication.remote.rest.dto.request;

import java.util.List;

public class AddPizzaDto {
    private String name;
    private List<AddSizeDto> sizes;

    public void setSizes(List<AddSizeDto> sizes) {
        this.sizes = sizes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AddSizeDto> getSizes() {
        return sizes;
    }

    public String getName() {
        return name;
    }

    public AddPizzaDto(String name, List<AddSizeDto> sizes) {
        this.name = name;
        this.sizes = sizes;
    }

    public AddPizzaDto() {
    }
}
