package com.abc.io.validation;

import com.abc.io.domain.Statement;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StatementValidator implements ConstraintValidator<ValidStatement, Statement> {
    @Override
    public boolean isValid(Statement statement, ConstraintValidatorContext constraintValidatorContext) {
        return statement.getEndBalance().equals(statement.getStartBalance().add(statement.getMutation()));
    }
}
