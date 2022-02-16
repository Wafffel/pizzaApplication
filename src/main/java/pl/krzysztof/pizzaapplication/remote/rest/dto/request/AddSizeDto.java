package pl.krzysztof.pizzaapplication.remote.rest.dto.request;

import pl.krzysztof.pizzaapplication.domain.SizeType;

import java.math.BigDecimal;

public class AddSizeDto {
    private SizeType size;
    private BigDecimal price;

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setSize(SizeType size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public SizeType getSize() {
        return size;
    }

    public AddSizeDto(SizeType size, BigDecimal price) {
        this.size = size;
        this.price = price;
    }

    public AddSizeDto() {
    }
}
