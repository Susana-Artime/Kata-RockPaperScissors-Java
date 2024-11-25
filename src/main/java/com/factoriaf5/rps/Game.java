package com.factoriaf5.rps;

import java.util.Scanner;

import com.factoriaf5.rps.application.Move;
import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

public class Game{
    
    public static Move getMove(int choice) {
        switch (choice) {
            case 1: return new Rock();
            case 2: return new Paper();
            case 3: return new Scissors();
            case 4: return new Lizard();
            case 5: return new Spock();
            default: return null;
        }
    }
    
    public static Move getRandomMove() {
        int randomChoice = (int) (Math.random() * 5) + 1;
        return getMove(randomChoice);
    }

    public static void playGame(Scanner sc) {
        System.out.println("Bienvenido a Piedra, Papel, Tijera, Lagarto o Spock!");
        System.out.println("Elige tu movimiento: (1) Piedra, (2) Papel, (3) Tijera, (4) Lagarto, (5) Spock");
    
        int userChoice = sc.nextInt();
        Move userMove = getMove(userChoice);
    
        if (userMove == null) {
            System.out.println("Elección inválida. Saliendo...");
            return;
        }
    
        Move computerMove = getRandomMove();
        System.out.println("Tu elección: " + userMove.getName());
        System.out.println("Elección del pc: " + computerMove.getName());
    
        if (userMove.win(computerMove)) {
            System.out.println("¡Ganas!");
        } else if (computerMove.win(userMove)) {
            System.out.println("¡El pc gana!");
        } else {
            System.out.println("¡Empate!");
        }
    }
    
    public static void main(String[] args) {
    
        try (Scanner sc = new Scanner(System.in)) {
            playGame(sc);
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    
    }
}

