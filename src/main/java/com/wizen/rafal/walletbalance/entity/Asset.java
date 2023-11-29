package com.wizen.rafal.walletbalance.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name="CURRENCY")
@Getter
@Setter
public class Asset {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

}

