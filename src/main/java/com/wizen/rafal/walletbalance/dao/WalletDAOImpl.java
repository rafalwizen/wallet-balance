package com.wizen.rafal.walletbalance.dao;

import com.wizen.rafal.walletbalance.entity.Wallet;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WalletDAOImpl implements WalletDAO {

    private EntityManager entityManager;

    @Autowired
    public WalletDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Wallet> findAll() {
        Session session = entityManager.unwrap(Session.class);
        Query<Wallet> query = session.createQuery("from Wallet", Wallet.class);
        return query.getResultList();
    }

    @Override
    public Wallet getByID(int theId) {
        return null;
    }

    @Override
    public Wallet save(Wallet asset) {
        return null;
    }

    @Override
    public void delete(int theId) {

    }
}
