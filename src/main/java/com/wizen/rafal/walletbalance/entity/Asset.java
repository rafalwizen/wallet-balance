package com.wizen.rafal.walletbalance.entity;

import com.wizen.rafal.walletbalance.enums.FiatCurrency;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

@Entity
@Table(name="ASSET")
@Getter
@Setter
public class Asset {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Date paymentDate;

    private FiatCurrency currencyUsedForPayment;

    private BigDecimal valuePaid;
}

