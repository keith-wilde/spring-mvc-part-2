package com.addolux.purchaserequest.dto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "purchase_requests")
public class PurchaseRequestDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String poNumber;

    @Column(name = "requestDate")
    private LocalDate date;

    @Column
    private String justification;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }
}
