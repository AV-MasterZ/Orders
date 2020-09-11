package org.zhadaev.app.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(name = "serial_number")
    private String serialNumber;

    @Column(nullable=false)
    private String title;

    private String description;

    @Column(name = "sp_date", nullable = false)
    private Date spDate;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Date getSpDate() {
        return spDate;
    }

    public void setSpDate(final Date spDate) {
        this.spDate = spDate;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(serialNumber, product.serialNumber) &&
                Objects.equals(title, product.title) &&
                Objects.equals(description, product.description) &&
                Objects.equals(spDate, product.spDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, title, description, spDate);
    }
}
