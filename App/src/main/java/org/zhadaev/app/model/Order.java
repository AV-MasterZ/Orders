package org.zhadaev.app.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_name", nullable=false)
    private String customerName;

    @Column(name = "customer_address", nullable=false)
    private String customerAddress;

    @Column(nullable=false)
    private Long amount;

    @Column(name = "created_dt", nullable=false)
    private Date createdDt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(final String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(final String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(final Long amount) {
        this.amount = amount;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(final Date createdDt) {
        this.createdDt = createdDt;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(customerName, order.customerName) &&
                Objects.equals(customerAddress, order.customerAddress) &&
                Objects.equals(amount, order.amount) &&
                Objects.equals(createdDt, order.createdDt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerName, customerAddress, amount, createdDt);
    }
}
