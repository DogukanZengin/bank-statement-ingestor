package com.abc.io.parse;


import com.abc.io.domain.StatementDto;

import java.io.File;
import java.util.List;

/**
 *
 */
public interface StatementMapper{

    List<StatementDto> map(File file) throws Exception;
}
