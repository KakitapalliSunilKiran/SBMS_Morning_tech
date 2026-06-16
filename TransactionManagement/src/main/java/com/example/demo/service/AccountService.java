//package com.example.demo.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.TransactionStatus;
//import org.springframework.transaction.support.DefaultTransactionDefinition;
//
//import com.example.demo.repo.AccountDao;
//
//@Service
//public class AccountService {
//
//    @Autowired
//    private AccountDao accountDao;
//
//    @Autowired
//    private PlatformTransactionManager transactionManager;
//
//    public void saveAccounts() {
//
//        DefaultTransactionDefinition def =
//                new DefaultTransactionDefinition();
//
//        TransactionStatus status =
//                transactionManager.getTransaction(def);
//
//        try {
//            accountDao.save("Sunil", 5000);
//             //transaction Synchronize
//            // Force exception
//            if (true) {
//                throw new RuntimeException("Failure occurred");
//            }
//
//            accountDao.save("Kiran", 3000);
//
//            transactionManager.commit(status);
//        } catch (Exception e) {
//            transactionManager.rollback(status);
//            throw e;
//        }
//    }
//}
//
