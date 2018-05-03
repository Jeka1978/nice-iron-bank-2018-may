package com.ironbanknice.ironbank.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@ContextConfiguration()
@ActiveProfiles("PROD")
public class PersonServiceTest {
    @Test
    public void incAge() throws Exception {
    }

}