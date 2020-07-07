package org.karabacode.tddstudents.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.karabacode.tddstudents.Calculador;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadorTests {

    @Test
    public void addTest(){
        Calculador calculador = new Calculador();
        int result = calculador.sum(2,2);
        Assert.assertEquals(4,result);
    }
}
