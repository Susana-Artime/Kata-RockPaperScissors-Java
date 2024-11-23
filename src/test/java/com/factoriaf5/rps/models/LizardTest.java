package com.factoriaf5.rps.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.factoriaf5.rps.application.Move;

public class LizardTest {

    @Test
    public void testLizardGetName() {
        Move lizard = new Lizard();
        assertEquals("Lagarto", lizard.getName(), "Se espera que el nombre sea 'Lagarto'");
    }

}
