package pl.krzysztof.pizzaapplication.remote.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import pl.krzysztof.pizzaapplication.domain.OrderStatusType;
import java.util.Date;

public class OrderStatusDto {
    private OrderStatusType status;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expectedAt;

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setStatus(OrderStatusType status) {
        this.status = status;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public OrderStatusType getStatus() {
        return status;
    }

    public OrderStatusDto() {
    }

    public OrderStatusDto(OrderStatusType status, Date createdAt, Date updatedAt, Date expectedAt) {
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.expectedAt = expectedAt;
    }
}
