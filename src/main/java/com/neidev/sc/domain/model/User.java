package com.neidev.sc.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "USER")
@Table(name = "TB_USER")
public class User {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(nullable = false, length = 30)
    private String name;

    /**
     *  CASCADE will make the relationship
     *  between entities strong
     *
     *  ex: when a user were deleted their
     *  account will be deleted too
     */
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card car;

    /**
     *  FetchType.EAGER - Everytime the api search for
     *  one user on database, will bring news and features
     *  associated with the user.
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;


    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCar() {
        return car;
    }

    public void setCar(Card car) {
        this.car = car;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
