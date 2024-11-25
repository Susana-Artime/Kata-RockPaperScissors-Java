package com.factoriaf5.rps;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.factoriaf5.rps.application.Move;
import com.factoriaf5.rps.application.MoveFactory;
import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;


public class GameTest 
{

    @Test
    void testGetMoveReturnsRock(){
        Move move = MoveFactory.createMove(1);
        assertTrue(move instanceof Rock, "Se espera Piedra para la entrada 1");
    }

    @Test
    void testGetMoveReturnsPaper() {
        Move move = MoveFactory.createMove(2);
        assertTrue(move instanceof Paper, "Se espera Papel para la entrada 2");
    }

    @Test
    void testGetMoveReturnsScissors() {
        Move move = MoveFactory.createMove(3);
        assertTrue(move instanceof Scissors, "Se espera Tijera para la entrada 3");
    }

    @Test
    void testGetMoveReturnsLizard() {
        Move move = MoveFactory.createMove(4);
        assertTrue(move instanceof Lizard, "Se espera Lagarto para la entrada 4");
    }

    @Test
    void testGetMoveReturnsSpock() {
        Move move = MoveFactory.createMove(5);
        assertTrue(move instanceof Spock, "Se espera Spock para la entrada 5");
    }

    @Test
    void testGetMoveReturnsNullForInvalidInput() {
        Move move = MoveFactory.createMove(6);
        assertNull(move, "Se espera null para la entrada 6");
    }

    @Test
    void testRandomMoveIsValid() {
        for (int i = 0; i < 100; i++) {
            Move move = Game.getRandomMove();
            assertTrue(move instanceof Rock || move instanceof Paper || move instanceof Scissors || move instanceof Spock || move instanceof Lizard, 
            "El movimiento generado debe ser Piedra, Papel, Tijera, Lagarto o Spock");

        }
    }

    @Test
    public void testRockWinScissors() {
        Move rock = new Rock();
        Move scissors = new Scissors();
        assertTrue(rock.win(scissors));
    }

    @Test
    public void testPaperWinRock() {
        Move paper = new Paper();
        Move rock = new Rock();
        assertTrue(paper.win(rock));
    }

    @Test
    public void testSpockWinScissors() {
        Move spock = new Spock();
        Move scissors = new Scissors();
        assertTrue(spock.win(scissors));
    }


    @Test
    public void testPlayGameUserWins() {
       
        String userInput = "1\n"; 
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

       
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

       
        Scanner sc = new Scanner(System.in);
        Game.playGame(sc);

        
        String output = out.toString();
        assertTrue(output.contains("Tu elección: Piedra"), "La salida debe contener 'Tu elección: Piedra'");
        assertTrue(output.contains("¡Ganas!") || output.contains("¡El pc gana!") || output.contains("¡Empate!"), 
            "El resultado debe ser válido");
    }

    @Test
    public void testPlayGameInvalidInput() {
        
        String userInput = "6\n";
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

       
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        
        Game.main(null);

        String output = out.toString();
        assertTrue(output.contains("Elección inválida"), "La salida debe indicar que la elección es inválida");
    }

    
}



    

