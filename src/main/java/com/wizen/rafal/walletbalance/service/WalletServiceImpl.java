package com.wizen.rafal.walletbalance.service;

import com.wizen.rafal.walletbalance.dao.WalletDAO;
import com.wizen.rafal.walletbalance.entity.Wallet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {

    private WalletDAO walletDAO;

    public WalletServiceImpl(WalletDAO walletDAO) {
        this.walletDAO = walletDAO;
    }

    @Override
    public List<Wallet> findAll() {
        return walletDAO.findAll();
    }
}
