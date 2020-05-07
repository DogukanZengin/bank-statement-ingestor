package com.abc.io.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StatementRepository extends CrudRepository<Statement, Long> {

    List<Statement> findAll();

    Statement findByReference(Long reference);
}
