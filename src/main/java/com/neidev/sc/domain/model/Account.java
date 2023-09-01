package com.neidev.sc.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "ACCOUNT")
@Table(name = "TB_ACCOUNT")
public class Account {


    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(unique = true, nullable = false)
    private String number;
    @Column(unique = true, nullable = false)
    private String agency;
    /**
     *  balance configuration (monetary)
     *
     *  precision - decimal
     *  scale - quantity of numbers
     *
     *  scale         precision
     *  10000000000 , 00
     */
    @Column(nullable = false, precision = 2, scale = 13)
    private BigDecimal balance;
    @Column(name = "additional_limit", nullable = false, precision = 2, scale = 13)
    private BigDecimal limit;

    public Account() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}

