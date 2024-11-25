package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.factoriaf5.rps.application.Move;

public class ScissorsTest {

    @Test
    public void testScissorsGetName() {
        Move scissors = new Scissors();
        assertEquals("Tijera", scissors.getName(), "Se espera que el nombre sea 'Tijera'");
    }
    
}
