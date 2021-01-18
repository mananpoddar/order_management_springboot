package com.example.ordermanagement.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "orders")
public class orders {
    @Id
    @GeneratedValue
    private Long orderId;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "order_items", joinColumns = @JoinColumn(name = "orderId"))
    private Set<Integer> itemId = new HashSet<>();

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Set<Integer> getItemId() {
        return itemId;
    }

    public void setItemId(Set<Integer> itemId) {
        this.itemId = itemId;
    }
}
