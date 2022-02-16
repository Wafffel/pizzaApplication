package pl.krzysztof.pizzaapplication.remote.rest.dto.request;

public class PersonOrderDto {
    private String name;
    private String phone;
    private String address;
    private Integer floor;

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFloor() {
        return floor;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public PersonOrderDto(String name, String phone, String address, Integer floor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.floor = floor;
    }

    public PersonOrderDto() {
    }
}
