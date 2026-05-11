package br.com.douglas.domain;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * Suíte que agrupa e executa todos os testes do projeto.
 */
@Suite
@SelectClasses({
    ClienteServiceTest.class,
    ClienteDAOTest.class,
    ProdutoServiceTest.class,
    ProdutoDAOTest.class,
    VendaDAOTest.class
})
public class AllTests {

}