package com.ironbanknice.ironbank.services;

import com.ironbanknice.ironbank.daos.MoneyDao;
import com.ironbanknice.ironbank.entities.Bank;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Evgeny Borisov
 */
@Service
@Transactional
@RequiredArgsConstructor
public class MoneyServiceImpl implements MoneyService {
    private final MoneyDao moneyDao;
    private final ProphetService prophetService;

    @EventListener(ContextRefreshedEvent.class)
    protected void fillBank() {
        moneyDao.save(Bank.builder().amount(1_000_000).build());
    }

    @Override
    public long loan(String name, int amount) {
        Bank bank = moneyDao.findAll().iterator().next();
        if (bank.getAmount() > amount && prophetService.willSurvive(name)) {
            bank.setAmount(bank.getAmount()-amount);
            return bank.getAmount();
        }
        return -1;
    }
}






