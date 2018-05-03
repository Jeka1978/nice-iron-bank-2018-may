package com.ironbanknice.ironbank.daos;

import com.ironbanknice.ironbank.entities.Bank;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface MoneyDao extends CrudRepository<Bank,Integer>{

    List<Bank> findByAmountLessThan(long min);

}
