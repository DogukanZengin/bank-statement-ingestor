package com.abc.io.domain;


import com.abc.io.validation.ValidStatement;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@EntityListeners(StatementAuditListener.class)
@Data
@Entity
@ValidStatement
public class Statement extends Auditable<String>{

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(message = "NotNull.reference")
    @Column(unique = true)
    Long reference;

    String accountNumber;
    BigDecimal startBalance;
    BigDecimal mutation;
    String description;
    BigDecimal endBalance;
}


