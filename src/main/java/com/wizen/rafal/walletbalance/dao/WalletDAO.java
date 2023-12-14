package com.wizen.rafal.walletbalance.dao;

import com.wizen.rafal.walletbalance.entity.Wallet;

import java.util.List;

public interface WalletDAO {
    public List<Wallet> findAll();
    public Wallet getByID(int theId);
    public Wallet save(Wallet asset);
    public void delete(int theId);
}
