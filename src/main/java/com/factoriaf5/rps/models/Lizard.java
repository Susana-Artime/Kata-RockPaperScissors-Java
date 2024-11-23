package com.factoriaf5.rps.models;

import com.factoriaf5.rps.application.Move;

public class Lizard extends Move {
        @Override
        public String getName() {
            return "Lagarto";
        }
    
        @Override
        public boolean win(Move other) {
            return other instanceof Paper || other instanceof Spock;
        }
    }
    

