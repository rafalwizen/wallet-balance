package com.wizen.rafal.walletbalance.service;

import com.wizen.rafal.walletbalance.dao.AssetDAO;
import com.wizen.rafal.walletbalance.entity.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {

    private AssetDAO assetDAO;

    @Autowired
    public AssetServiceImpl(AssetDAO assetDAO) {
        this.assetDAO = assetDAO;
    }


    @Override
    public List<Asset> findAll() {
        return assetDAO.findAll();
    }
}
