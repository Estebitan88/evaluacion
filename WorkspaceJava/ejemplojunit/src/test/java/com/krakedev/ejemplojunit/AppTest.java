package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void testSumar() {
        Calculadora c = new Calculadora(5, 10); 
        int resultado = c.sumar(); 
        assertTrue(resultado==15);
    }

    @Test
    public void testRestar() {
        Calculadora c = new Calculadora(10, 5); 
        int resultado = c.restar(); 
        assertTrue(resultado==5);
    }

}
