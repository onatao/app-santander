package com.neidev.sc.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "NEWS")
@Table(name = "TB_NEWS")
public class News extends BaseInformation {

    public News() {
        super();
    }
}
