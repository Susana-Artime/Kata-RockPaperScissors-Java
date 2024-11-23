package com.factoriaf5.rps;

import java.util.Scanner;

import com.factoriaf5.rps.application.Move;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class Game{

   
    public static void main(String[] args) {

       try(Scanner sc = new Scanner(System.in)){

        System.out.println("Bienvenido a Piedra,Papel o Tijera!");
        System.out.println("Elige tu movimiento: (1) Piedra, (2) Papel, (3) Tijera");
        
        int userChoice = sc.nextInt();
        Move userMove = getMove(userChoice);
        
        if (userMove == null) {
            System.out.println("Elección invalida.Saliendo...");
            return;
            
        }

        
        Move computerMove = getRandomMove();
        System.out.println("Tu elección: " + userMove.getName());
        System.out.println("Elección del pc: " + computerMove.getName());

        if (userMove.win(computerMove)) {
            System.out.println("Ganas!");
        } else if (computerMove.win(userMove)) {
            System.out.println("El pc gana!");
        } else {
            System.out.println("Empate!");
        }

        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    
    }

    private static Move getMove(int choice) {
        switch (choice) {
            case 1: return new Rock();
            case 2: return new Paper();
            case 3: return new Scissors();
            default: return null;
        }
    }

    private static Move getRandomMove() {
        int randomChoice = (int) (Math.random() * 3) + 1;
        return getMove(randomChoice);
    }

}

