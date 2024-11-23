package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

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

    @Test
    public void testLizardWinPaper() {
        Move lizard = new Lizard();
        Move paper = new Paper();
        assertTrue(lizard.win(paper));
    }

    
    @Test
    public void testLizardWinSpock() {
        Move lizard = new Lizard();
        Move spock = new Spock();
        assertTrue(lizard.win(spock)); 
    }

    
    @Test
    public void testLizardLoseToRock() {
        Move lizard = new Lizard();
        Move rock = new Rock();
        assertFalse(lizard.win(rock));
    }

   
    @Test
    public void testLizardLoseToScissors() {
        Move lizard = new Lizard();
        Move scissors = new Scissors();
        assertFalse(lizard.win(scissors));
    }

   
    @Test
    public void testLizardDrawsWithLizard() {
        Move lizard1 = new Lizard();
        Move lizard2 = new Lizard();
        assertFalse(lizard1.win(lizard2)); 
    }

    @Test
    public void testScissorsWinLizard() {
        Move scissors = new Scissors();
        Move lizard = new Lizard();
        assertTrue(scissors.win(lizard));  
    }

    @Test
    public void testScissorsLoseToRock() {
        Move scissors = new Scissors();
        Move rock = new Rock();
        assertFalse(scissors.win(rock));  
    }

    
    @Test
    public void testScissorsLoseToSpock() {
        Move scissors = new Scissors();
        Move spock = new Spock();
        assertFalse(scissors.win(spock));  
    }

    @Test
    public void testScissorsDrawsWithScissors() {
        Move scissors1 = new Scissors();
        Move scissors2 = new Scissors();
        assertFalse(scissors1.win(scissors2)); 
    }
}

    

