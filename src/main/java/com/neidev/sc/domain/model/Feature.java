package com.neidev.sc.domain.model;

import jakarta.persistence.*;

@Entity(name = "FEATURE")
@Table(name = "TB_FEATURE")
public class Feature extends BaseInformation {

    public Feature() {
        super();
    }
}

