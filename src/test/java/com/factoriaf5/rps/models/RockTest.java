package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.factoriaf5.rps.application.Move;

public class RockTest {

    @Test
    public void testRockGetName() {
        Move rock = new Rock();
        assertEquals("Piedra", rock.getName(), "Se espera que el nombre sea 'Piedra'");
    }
    
}
