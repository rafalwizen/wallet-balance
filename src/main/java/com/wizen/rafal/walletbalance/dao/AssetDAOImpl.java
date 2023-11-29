package com.wizen.rafal.walletbalance.dao;

import java.util.List;

import jakarta.persistence.EntityManager;

import com.wizen.rafal.walletbalance.entity.Asset;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AssetDAOImpl implements AssetDAO {

    private EntityManager entityManager;

    @Autowired
    public AssetDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Asset> findAll() {
        Session session = entityManager.unwrap(Session.class);
        Query<Asset> query = session.createQuery("from Asset", Asset.class);
        return query.getResultList();
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
