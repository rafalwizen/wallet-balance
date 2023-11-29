package com.wizen.rafal.walletbalance.dao;

import com.wizen.rafal.walletbalance.entity.Asset;

import java.util.List;

public interface AssetDAO {
    public List<Asset> findAll();
    public Asset getByID(int theId);
    public Asset save(Asset asset);
    public void delete(int theId);
}
