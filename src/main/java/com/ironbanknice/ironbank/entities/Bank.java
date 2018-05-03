package com.ironbanknice.ironbank.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Table(name = "banks")
public class Bank {
    @Id
    @GeneratedValue
    private int id;
    private long amount;



}
