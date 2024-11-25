package com.factoriaf5.rps;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import com.factoriaf5.rps.application.Move;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;


public class GameTest 
{
    @Test
    void testGetMoveReturnsRock(){
        Move move = Game.getMove(1);
        assertTrue(move instanceof Rock, "Se espera Piedra para la entrada 1");
    }

    @Test
    void testGetMoveReturnsPaper() {
        Move move = Game.getMove(2);
        assertTrue(move instanceof Paper, "Se espera Papel para la entrada 2");
    }

    @Test
    void testGetMoveReturnsScissors() {
        Move move = Game.getMove(3);
        assertTrue(move instanceof Scissors, "Se espera Tijera para la entrada 3");
    }

    @Test
    void testGetMoveReturnsNullForInvalidInput() {
        Move move = Game.getMove(4);
        assertNull(move, "Se espera null para la entrada 4");
    }

    @Test
    void testRandomMoveIsValid() {
        for (int i = 0; i < 100; i++) {
            Move move = Game.getRandomMove();
            assertTrue(move instanceof Rock || move instanceof Paper || move instanceof Scissors, 
                "El movimiento generado debe ser Piedra, Papel o Tijera");
        }
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
        
        String userInput = "5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

       
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        
        Game.main(null);

        String output = out.toString();
        assertTrue(output.contains("Elección inválida"), "La salida debe indicar que la elección es inválida");
    }
    
}
