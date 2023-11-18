package com.wizen.rafal.walletbalance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.wizen.rafal.walletbalance.entity.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AssetDAOImpl implements AssetDAO {

    private final EntityManager entityManager;

    @Autowired
    public AssetDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Asset> getAll() {
        return null;
    }

    @Override
    public Asset getByID(int theId) {
        return null;
    }

    @Override
    public Asset save(Asset asset) {
        return null;
    }

    @Override
    public void delete(int theId) {

    }
}
