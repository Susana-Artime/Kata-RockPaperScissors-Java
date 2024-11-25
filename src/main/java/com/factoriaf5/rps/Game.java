package com.factoriaf5.rps;

import java.util.Scanner;
import com.factoriaf5.rps.application.Move;
import com.factoriaf5.rps.application.MoveFactory;

public class Game{
    
    public static Move getRandomMove() {
        int randomChoice = (int) (Math.random() * 5) + 1;
        return MoveFactory.createMove(randomChoice);
    }

    public static void playGame(Scanner sc) {
        System.out.println("Bienvenido a Piedra, Papel, Tijera, Lagarto o Spock!");
        System.out.println("Elige tu movimiento: (1) Piedra, (2) Papel, (3) Tijera, (4) Lagarto, (5) Spock");
    
        int userChoice = sc.nextInt();
        Move userMove = MoveFactory.createMove(userChoice);
    
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

