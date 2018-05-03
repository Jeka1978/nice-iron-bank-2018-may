//package com.ironbanknice.ironbank.daos;
//
//import com.ironbanknice.ironbank.entities.Bank;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
///**
// * @author Evgeny Borisov
// */
//@Repository
//public class MoneyDaoImpl implements MoneyDao {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public List<Bank> findAll() {
//        return entityManager.createQuery("from Bank").getResultList();
//    }
//}
