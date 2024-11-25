package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.factoriaf5.rps.application.Move;

public class SpockTest {

    @Test
    public void testSpockGetName() {
        Move spock = new Spock();
        assertEquals("Spock", spock.getName(), "Se espera que el nombre sea 'Spock'");
    }

    
}
