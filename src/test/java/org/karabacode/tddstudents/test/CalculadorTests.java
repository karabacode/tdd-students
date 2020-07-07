package org.karabacode.tddstudents.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.karabacode.tddstudents.Calculador;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadorTests {

    private Calculador calculador;

    @Before
    public void setUp(){
        this.calculador = new Calculador();
    }

    @Test
    public void addTest(){
        int result = this.calculador.sum(2,2);
        Assert.assertEquals(4,result);
    }

    @Test
    public void addDiferentesArgumentos(){
        int result = this.calculador.sum(10,2);
        Assert.assertEquals(12,result);
    }

    @Test
    public void subsTest(){
        int result = this.calculador.resta(5,3);
        Assert.assertEquals(2,result);
    }
}
