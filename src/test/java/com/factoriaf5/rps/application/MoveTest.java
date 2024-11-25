package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class MoveTest {
    @Test
    void testRockWinScissors() {
        Move rock = new Rock();
        Move scissors = new Scissors();
        assertTrue(rock.win(scissors), "Piedra debe ganar a Tijera");
    }

    @Test
    void testPaperWinRock() {
        Move paper = new Paper();
        Move rock = new Rock();
        assertTrue(paper.win(rock), "Papel debe ganar a Piedra");
    }

    @Test
    void testScissorsWinPaper() {
        Move scissors = new Scissors();
        Move paper = new Paper();
        assertTrue(scissors.win(paper), "Tijera debe ganar a Papel");
    }

    @Test
    void testRockDoesNotWinPaper() {
        Move rock = new Rock();
        Move paper = new Paper();
        assertFalse(rock.win(paper), "Piedra no debe ganar a Papel");
    }

    @Test
    void testPaperDoesNotWinScissors() {
        Move paper = new Paper();
        Move scissors = new Scissors();
        assertFalse(paper.win(scissors), "Papel no debe ganar a Tijera");
    }

    @Test
    void testScissorsDoesNotWinRock() {
        Move scissors = new Scissors();
        Move rock = new Rock();
        assertFalse(scissors.win(rock), "Tijera no debe ganar a Piedra");
    }
    
}
