package com.wizen.rafal.walletbalance.service;

import com.wizen.rafal.walletbalance.entity.Wallet;

import java.util.List;

public interface WalletService {
    public List<Wallet> findAll();
}
