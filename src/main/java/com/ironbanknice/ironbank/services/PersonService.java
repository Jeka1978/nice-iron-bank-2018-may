package com.ironbanknice.ironbank.services;

import com.ironbanknice.ironbank.model.Person;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Service
@Profile("PROD")
//spring.profiles.active = PROD
public class PersonService {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public void incAge() {
        Query query = entityManager.createQuery("from Person where age>:age");
        List<Person> persons = query.setParameter("age", 18).getResultList();
        for (Person person : persons) {
            person.setAge(person.getAge()+1);
        }
    }
}
