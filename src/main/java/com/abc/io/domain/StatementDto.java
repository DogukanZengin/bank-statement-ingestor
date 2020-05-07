package com.abc.io.domain;

import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class StatementDto {

    Long id;

    @CsvBindByName(column = "Reference", required = true)
    Long reference;

    @CsvBindByName(column = "Account Number", required = true)
    String accountNumber;

    @CsvBindByName(column = "Start Balance", required = true)
    BigDecimal startBalance;

    @CsvBindByName(column = "Mutation", required = true)
    BigDecimal mutation;

    @CsvBindByName(column = "Description", required = true)
    String description;

    @CsvBindByName(column = "End Balance", required = true)
    BigDecimal endBalance;

}
