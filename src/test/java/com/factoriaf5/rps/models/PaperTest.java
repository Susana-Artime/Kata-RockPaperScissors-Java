package com.factoriaf5.rps.models;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.factoriaf5.rps.application.Move;

public class PaperTest {
    @Test
    public void testPaperGetName() {
        Move paper = new Paper();
        assertEquals("Papel", paper.getName(), "Se espera que el nombre sea 'Papel'");
    }

}